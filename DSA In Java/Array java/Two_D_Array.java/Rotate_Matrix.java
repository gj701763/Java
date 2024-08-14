//package Array java.Two_D_Array.java;
/*  Given a square matrix, 
    turn it by 90 degrees in a clockwise direction without using any extra space.
 */
import java.util.*;
public class Rotate_Matrix {

    static void printMatrix(int arr[][], int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    static void reverse(int arr[]) {
        int i = 0; 
        int j = arr.length - 1;
        while(i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        
    }

    static void tranposematrix(int arr[][], int n) {
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void rotateMatrix(int arr[][], int n) {
        tranposematrix(arr, n);
        for(int i = 0; i < n; i++) {
            reverse(arr[i]);
        }
        printMatrix(arr, n);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of Matrix is : ");
            int n = sc.nextInt();
            int arr[][] = new int[n][n];

            System.out.println("Enter the "+n*n+" size of matrix is : ");
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Rotate matrix is : ");
             rotateMatrix(arr, n);
        }
    }
}
