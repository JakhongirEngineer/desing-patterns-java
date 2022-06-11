package socialmedia;

public class Main {

    public static void main(String[] args) {

        Network network = new Tiktok("john", "password");
        network.post("The thing that I love about myself is that I love myself posting on tiktok");

        network = new Instagram("john", "password");
        network.post("data");

    }

}
