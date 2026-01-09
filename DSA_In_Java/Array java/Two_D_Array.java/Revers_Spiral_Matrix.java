import java.util.*;
public class Revers_Spiral_Matrix {

    static void print(int m[][], int r, int c) {
        System.out.println("Result of Matrix is : ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void R_Spiral(int m[][], int r, int c) {
        int element = 0;
        int n = r * c;
        int topr = 0;
        int bottomr = c-1;
        int leftc = 0;
        int rightc = r-1;
        while(element <= n) {
            for(int i = topr; i <= bottomr && element < n; i++) {
                System.out.print(m[i][leftc]+" ");
                element++;
            }
            leftc++;
            for(int j = leftc; j <= rightc  && element < n; j++) {
                System.out.print(m[bottomr][j]+" ");
                element++;
            }
            bottomr--;
            for(int i = bottomr; i <= topr && element < n; i--) {
                System.out.print(m[i][rightc]+" ");
                element++;
            }
            rightc++;
            for(int j = rightc; j <= leftc && element < n; j++) {
                System.out.print(m[topr][j]+" ");
                element++;
            }
            topr--;
            
        }
    }

    public static void main(String[] args) {
        try(Scanner sc =  new Scanner(System.in)) {
            System.out.println("Enter the row and column of matrix is ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            int m[][] = new int[r][c];
            System.out.println("Enter the "+r*c+" size of matrix is : ");
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    m[i][j] = sc.nextInt();
                }
            }
            //print(m, r, c);
            System.out.println("Spiral order is : ");
            R_Spiral(m, r, c);

        }
    }
}
