import java.util.Scanner;

public class ArrayMatrix {
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
            System.out.println("Matrix is Given by : ");
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < cols; j++) {
                    System.out.print(num[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
