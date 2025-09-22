import java.util.*;
public class ChangeStr {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String s = sc.next();

            String str = (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') ? s.toUpperCase() : s.toLowerCase();
            System.out.println(str);
        }
    }
}
