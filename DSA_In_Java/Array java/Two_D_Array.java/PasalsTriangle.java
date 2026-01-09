//package Array java.Two_D_Array.java;
/* Given an integer n, return the first n rows of Pascal's triangle.
   In Pascal's triangle, each number is the sum of the two numbers directly above it as shown :
   for n = 5;

*/
import java.util.*;
public class PasalsTriangle {

    public static void printMatrix(int[][] arr, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void PascalMatrix(int n) {
        int[][] ans = new int[n][];
        for(int i  = 0; i < n; i++) {
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;
            for(int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }

        }
        printMatrix(ans, n);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of Matrix is : ");
            int n = sc.nextInt();

            PascalMatrix(n);
        }
        
    }
}
