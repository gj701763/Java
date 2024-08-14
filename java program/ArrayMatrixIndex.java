import java.util.Scanner;

public class ArrayMatrixIndex {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your Row is : ");
            int row = sc.nextInt();
            System.out.print("Enter your column is : ");
            int cols = sc.nextInt();

            int num[][] = new int[row][cols];
            // Input
            System.out.println("Enter your Matrix is : ");
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < cols; j++) {
                    num[i][j] = sc.nextInt();
                }
            }
            System.out.print("Enter your Keys is : ");
            int x = sc.nextInt();
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < cols; j++) {
                    if(num[i][j] == x) {
                        System.out.print("Find the Index at Location : ["+ i + "] ["+ j +"]" );
                    }
                }
            }
        }
    }
}
