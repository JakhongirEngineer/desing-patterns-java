package socialmedia;

import java.util.Arrays;

public class Tiktok extends Network{


    public Tiktok(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    boolean logIn(String username, String password) {
        return dbHas(username, password);
    }

    @Override
    boolean sendData(String msg) {
        System.out.println("sending data ...");
        System.out.println(msg);
        return true;
    }

    private boolean dbHas(String username, String password) {
        return username.equals("john") && password.equals("password");
    }

}
