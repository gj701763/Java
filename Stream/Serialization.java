package Stream;

import java.io.*;

class student implements Serializable {
    String name;
    int rid;
    String contact;

    student(String n, int r, String c) {
        this.name = n;
        this.rid = r;
        this.contact = c;
    }
}

public class Serialization {
    public static void main(String[] args) {
        try {
            student s = new student("Gaju", 22, "102003");
            FileOutputStream f = new FileOutputStream("student.ser");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(s);
            o.close();
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
