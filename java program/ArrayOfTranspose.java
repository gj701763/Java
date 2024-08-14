import java.util.Scanner;

public class ArrayOfTranspose {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your Row is : ");
            int row = sc.nextInt();
            System.out.print("Enter your column is : ");
            int cols = sc.nextInt();

            int num[][] = new int[row][cols];

            System.out.println("Enter your Matrix is : ");
            // input
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < cols; j++) {
                    num[i][j] = sc.nextInt();
                }
            }

            //output
            int a[][] = new int[row][cols];
            System.out.println("Transport Matrix is : ");
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < cols; j++) {
                    a[i][j] = num[j][i];
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
