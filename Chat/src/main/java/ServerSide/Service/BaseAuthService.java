package ServerSide.Service;

import ServerSide.interfaces.AuthService;

import java.util.ArrayList;
import java.util.List;

public class BaseAuthService implements AuthService {

    private List<Entry> entryList;

    public BaseAuthService() {
        entryList = new ArrayList<>();
        entryList.add(new Entry("login1", "pass1", "One"));
        entryList.add(new Entry("login2", "pass2", "Two"));
        entryList.add(new Entry("login3", "pass3", "Three"));
    }

    @Override
    public void start() {
        System.out.println("AuthService start");
    }

    @Override
    public void stop() {
        System.out.println("AuthService stop");
    }

    @Override
    public String getNickByLoginAndPassword(String login, String password) {
        for (Entry e : entryList) {
            if (e.login.equals(login) && e.password.equals(password)) {
                return e.nick;
            }
        }
        return null;
    }


    private class Entry {
        public String getLogin() {
            return login;
        }

        public String getPassword() {
            return password;
        }

        public String getNick() {
            return nick;
        }

        private String login;
        private String password;
        private String nick;

        public Entry(String login, String password, String nick) {
            this.login = login;
            this.password = password;
            this.nick = nick;
        }
    }

}
