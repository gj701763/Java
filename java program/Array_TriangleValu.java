import java.util.*;
public class Array_TriangleValu {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the row : ");
            int r = sc.nextInt();
            int arr[][] = new int[r][];
            arr[0] = new int[1];
            arr[1] = new int[2];
            arr[2] = new int[3];
            arr[3] = new int[4];

            int k = 1;
            for(int i = 0; i < r; i++) {
                for(int j = 0; j <i+1; j++) {
                    arr[i][j] = k;
                    k++;
                }
            }
            System.out.println("Print the value : ");
            for(int i = 0; i < r; i++) {
                for(int j = 0; j <i+1; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
