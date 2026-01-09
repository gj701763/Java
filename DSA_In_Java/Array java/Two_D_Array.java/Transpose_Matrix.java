//package Array java.Two_D_Array.java;
import java.util.*;
public class Transpose_Matrix {

    static void printMatrix(int arr[][], int r, int c) {
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void swap(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    static void tranposematrix(int arr[][], int r, int c) {
        for(int i = 0; i < c; i++) {
            for(int j = i+1; j < r; j++) {
                swap(arr, i, j);
            }
        }
        printMatrix(arr, r, c);
    }

    static void tranposematrixs(int arr[][], int r, int c) {
        int ans[][] = new int[c][r];
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        printMatrix(ans, r, c);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of Matrix is : ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int arr[][] = new int[r][c];

            System.out.println("Enter the "+r*c+" size of matrix is : ");
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            //printMatrix(arr, r, c);
            System.out.println("Transpose of matrix is : ");
            tranposematrix(arr, r, c);
        }
    }
}
