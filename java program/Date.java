
//package java program;
import java.text.SimpleDateFormat;

public class Date {
    public static void main(String[] args) {
        String pattern = "MM/DD/YY";

        SimpleDateFormat s = new SimpleDateFormat(pattern);

        String date = s.format(new Date());
        System.out.println(date);
    }
}
