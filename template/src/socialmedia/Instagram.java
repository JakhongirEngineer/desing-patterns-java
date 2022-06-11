package socialmedia;

public class Instagram extends Network{

    public Instagram(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    boolean logIn(String username, String password) {
        return username.equals("john") && password.equals("password");
    }

    @Override
    boolean sendData(String msg) {
        System.out.println("sending data to instagram");
        System.out.println(msg);
        return true;
    }
}
