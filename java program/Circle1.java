/*  Write a function that takes in the radius as input and returns the
    circumference of a circle.  */

    
import java.util.Scanner;
public class Circle1 {
    public static void printcircumference(int r) {
        double circu = 2 * 3.14 * r;
        System.out.print("Circumference is : " + circu);
        return;
    }

    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the redius of a circle : ");
            int r = sc.nextInt();
            printcircumference(r);
        }
    }
}
