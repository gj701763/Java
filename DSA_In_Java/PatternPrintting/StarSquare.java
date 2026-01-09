//package DSA In Java.PatternPrintting;
import java.util.*;
public class StarSquare {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size is : ");
            int n = sc.nextInt();
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
