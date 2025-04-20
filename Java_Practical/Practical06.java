//   Programs for addition and multiplication of matrices.

import java.util.*;
public class Practical06 {

// Display the Result Matrix 
    static void print_Matrices(int arr[][], int r, int c) {
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
 //  Addition of Matrix a and b 
    static void addition_Matrices(int a[][], int b[][], int r, int c) {
        System.out.println("Addition of Matrix a and Matrix b is : ");
        int add[][] = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                add[i][j] = a[i][j] + b[i][j];
            }
        }
        print_Matrices(add, r, c);
    }
   // Multiplication of Matrix a and b 
    static void multiplication_Matrices(int a[][], int b[][], int r, int c) {
        System.out.println("Multiplication of Matrix a and Matrix b is : ");
        int mul[][] = new int[c][r];
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                for(int k = 0; k < r; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        print_Matrices(mul, r, c);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Row and Column of Matrices is : ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            int a[][] = new int[r][c];
            int b[][] = new int[r][c];

            System.out.println("Enter the "+r*c+" size of matrix  a is : ");
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the "+r*c+" size of matrix b is : ");
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter Key 1 Run Addition Method : ");
            System.out.println("Enter Key 2 Run Multiplication Method : ");
            int n = sc.nextInt();
            switch(n) {
                case 1: addition_Matrices(a, b, r, c);
                break;
                case 2: multiplication_Matrices(a, b, r, c);
                break;
                default: System.out.println("Enter The Invalid Key !!!");
            }
            
        }
    }
}
