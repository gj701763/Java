//package DSA In Java.PatternPrintting;
import java.util.*;

/* 1)
 *  1 2 3 4 5
 *  1 2 3 4 5
 *  1 2 3 4 5
 *  1 2 3 4 5 
 *  1 2 3 4 5
 */
public class NumIncre {
    public static void main(String[] args) {
         try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();

        //     for(int i = 1; i <= n; i++) {
        //         for(int j = 1; j <= n; j++) {
        //             System.out.print(j+" ");
        //         }
        //         System.out.println();
        //     }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <=n; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        }
    }
}
