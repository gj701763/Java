//package DSA In Java.PatternPrintting;
import java.util.*;
public class StarRectangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the row : ");
            int row = sc.nextInt();
            System.out.print("Enter the column : ");
            int col= sc.nextInt();
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
