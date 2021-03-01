package ServerSide.Service;

import ServerSide.interfaces.AuthService;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyServer {

    private final int PORT = 8190;

    private List<ClientHandler> clients;

    public List<ClientHandler> getClients() {
        return clients;
    }

    private AuthService authService;

    public AuthService getAuthService() {
        return this.authService;
    }

    public MyServer() {
        try (ServerSocket server = new ServerSocket(PORT)) {
            authService = new BaseAuthService();
            authService.start();
            clients = new ArrayList<>();
            System.out.println("Server has been started");
            while (true) {
                Socket socket = server.accept();
                System.out.println("Client connected");
                new ClientHandler(this, socket);
            }

        } catch (IOException e) {
            System.out.println("Server collapsed");
        } finally {
            if (authService != null) {
                authService.stop();
            }
        }
    }

    public synchronized void broadcastMessage(String message) {
        for (ClientHandler o : clients) {
            o.sendMessage(message);
        }
    }

    public synchronized void subscribe(ClientHandler client){
        clients.add(client);
    }

    public synchronized void unsubscribe(ClientHandler client){
        clients.remove(client);
    }


    public boolean isNickBusy(String nick) {
        for (ClientHandler c :clients) {
            if (c.getName().equals(nick)){
                return true;
            }
        }
        return false;
    }
}
