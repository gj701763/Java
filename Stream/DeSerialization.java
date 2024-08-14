package Stream;

import java.io.*;

public class DeSerialization {
    public static void main(String[] args) {
        student s = null;
        try {
            FileOutputStream f = new FileOutputStream("student.ser");
            ObjectOutputStream o = new ObjectOutputStream(f);
            s = (student) ((Object) o).readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(s.name);
        System.out.println(s.rid);
        System.out.println(s.contact);
    }

}
