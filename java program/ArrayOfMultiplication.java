import java.util.Scanner;

public class ArrayOfMultiplication {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your Row is : ");
            int row = sc.nextInt();
            System.out.print("Enter your Column is : ");
            int col = sc.nextInt();
            int first[][] = new int[row][col];
            int second[][] = new int[row][col];
            int mul[][] = new int[row][row];

            System.out.println("Enter you first Matrix is : ");
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    first[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter your second Matrix is : ");
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    second[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    mul[i][j] = 0;
                    for(int k = 0; k < col; k++) {
                        mul[i][j] += first[i][k] * second[k][j];
                    }
                }
            }
            System.out.println("Multiplication of two Matrix is : ");
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    System.out.println(mul[i][j]+ " ");
                }
                System.out.println();
            }

        }
    }
}
