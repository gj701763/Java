import java.util.*;
public class palindrom {

    static boolean ispalindrom(String s, int l, int r) {
        if( l >= r) {
            return true;
        }
       return (s.charAt(l) == s.charAt(r) && ispalindrom(s, l + 1, r - 1));
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter you string is : ");
            String s = sc.nextLine();
            System.out.println(ispalindrom(s, 0, s.length() - 1));

        }
    }
}