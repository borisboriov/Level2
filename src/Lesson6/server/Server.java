package Lesson6.server;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static Socket socket;
    private static ServerSocket serverSocket;
    private static DataInputStream dis;
    private static DataOutputStream dos;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        try {
            serverSocket = new ServerSocket(8190);
            System.out.println("Server has been started, waiting for connection...");
            socket = serverSocket.accept();
            System.out.println("Client connected");
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());

            Thread thread = new Thread(() -> {
                while (true) {
                    try {
                        String msgFromServer = "";
                        if (reader.ready()) {
                            msgFromServer = reader.readLine();
                        }

                        if (!msgFromServer.isEmpty()){
                            dos.writeUTF(msgFromServer);
                            System.out.println(msgFromServer);
                        }
                    } catch (IOException e){
                        e.printStackTrace();

                    }

                }
            });
            thread.setDaemon(true);
            thread.start();

            while (true) {
                String msgFromClient = dis.readUTF();
                if (msgFromClient.equalsIgnoreCase("/end")){
                    break;
                }
                System.out.println(msgFromClient);
            }
        } catch (IOException ignored) {
            System.out.println("Disconnected");
        }

    }


}
//1. Написать консольный вариант клиент\серверного приложения, в котором пользователь может писать сообщения,
// как на клиентской стороне, так и на серверной. Т.е. если на клиентской стороне написать "Привет",
// нажать Enter то сообщение должно передаться на сервер и там отпечататься в консоли.

