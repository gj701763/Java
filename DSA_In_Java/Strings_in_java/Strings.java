package DSA_In_Java.Strings_in_java;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            for(int i = 2; i < 4; i++) {
                System.out.print(str.substring(i));
            }

        }
    }
}
