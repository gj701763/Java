//package Two_D_Array.java;
import java.util.*;
public class Sum_of_Matrix {

    static void printArray(int d[][],int r, int c) {
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void Mul_Of_Matrixs(int a[][], int b[][], int r, int c) {
        int d[][] = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                for(int k = 0; k < r; k++) {
                    d[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        printArray(d, r, c);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no row is : ");
            int r = sc.nextInt();
            System.out.println("Enter the column is : ");
            int c = sc.nextInt();
            int a[][] = new int[r][c];
            int b[][] = new int[r][c];
            int d[][] = new int[r][c];
            System.out.println("Enter the "+r*c+" no Element in a : ");
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the "+r*c+" no Element in b : ");
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    d[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("Sum of array of a and array of b is : ");
            printArray(d,r,c);
        }

    }
}
