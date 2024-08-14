package Stream;

import java.io.*;

public class FileWriter {
    public FileWriter(String string) {
    }

    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("java.txt");
        f.write("Welcome java");
        f.close();
        System.out.println("Success");
    }

    void close() {
    }

    private void write(String string) {
    }

    public void write(int c) {
    }
}
