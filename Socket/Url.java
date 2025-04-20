package Socket;

import java.net.*;

public class Url {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("https://www.youtube.com/Youtub");
        System.out.println(hp.getProtocol());
        System.out.println(hp.getFile());
    }
}
