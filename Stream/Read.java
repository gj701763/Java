package Stream;

import java.io.*;

public class Read {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // char c = br.read();
        // System.out.println(c); /// Reading Charecter
        try {

            // InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader b = new BufferedReader();
            String t = b.readLine();
            System.out.println(t);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
