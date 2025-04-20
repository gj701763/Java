package Socket;

import java.net.*;

public class InetAddr {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress a = InetAddress.getLocalHost();
        System.out.println(a);
        a = InetAddress.getByName("www.youtube.com");
        System.out.println(a);
        InetAddress[] s = Inet4Address.getAllByName("www.google.com");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
