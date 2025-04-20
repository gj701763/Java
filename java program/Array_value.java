import java.util.*;
public class Array_value {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of row is : ");
            int r = sc.nextInt();
            System.out.println("Enter the size of column is : ");
            int c = sc.nextInt();

            int arr[][] = new int[r][c];
            int k = 1;
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    arr[i][j] = k;
                    k++;
                }
            }
            System.out.println("Print the value is : ");
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
