package Socket;

import java.util.Scanner;

public class RunFiles {

    static void print(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int arr[][])

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your row and column is : ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int arr[][] = new int[r][c];

            System.out.println("Enter your " + r * c + " Element of matrix is : ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            print(arr, r, c);
        }
    }
}