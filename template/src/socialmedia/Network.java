package socialmedia;

import java.nio.charset.StandardCharsets;

public abstract class Network {
    protected String username;
    protected String password;

    public Network(){}

    public Network(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean post(String message) {
        if(logIn(username, password)) {
            return  sendData(message);
        }
        return false;
    }

    abstract boolean logIn(String username, String password);
    abstract boolean sendData(String msg);

}
