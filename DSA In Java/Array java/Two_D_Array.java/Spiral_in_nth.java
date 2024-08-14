import java.util.*;
public class Spiral_in_nth {
    static void printMatrix(int a[][], int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] spiralm(int n) {
        int a[][] = new int[n][n];
        int topr = 0;
        int bottomr = n-1;
        int leftc = 0;
        int rightc = n-1;
        int curr = 1;
        int m = n*n;
        while(curr <= m) {
            for(int i = leftc;  i<= rightc && curr <= m; i++) {
                a[topr][i] = curr++;
            }
            topr++;
            for(int j = topr; j <= bottomr && curr <= m; j++) {
                a[j][rightc] = curr++;
            }
            rightc--;
            for(int i = rightc; i >= leftc && curr <= m; i--) {
                a[bottomr][i] = curr++;
            }
            bottomr--;
            for(int j = bottomr; j >= topr && curr <= m; j--) {
                a[j][leftc] = curr++;
            }
            leftc++;

        }
        return a;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of spiral order : ");
            int n = sc.nextInt();

            int a[][] = spiralm(n);
            System.out.println("print the matrix is : ");
            printMatrix(a, n);
        }
        
    }
}