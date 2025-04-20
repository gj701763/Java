//package Two_D_Array.java;
import java.util.*;
public class Spiral_Matrix {

    static void printMatrix(int m[][], int r, int c) {
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void spiralmatrixis(int m[][], int r, int c) {
        int topr = 0, bottomr = r-1, leftc = 0, rightc = c-1;
        int telement = 0;
        int n = r * c;
        while(telement <=  n) {
            for(int i = leftc; i <= rightc && telement < n; i++) {
                System.out.print(m[topr][i]+" ");
                telement++;
            }
            topr++;
            for(int j = topr; j <= bottomr && telement < n; j++){
                System.out.print(m[j][rightc]+" ");
                telement++;
            }
            rightc--;
            for(int i = rightc; i <= leftc && telement < n; i--) { 
                System.out.print(m[bottomr][i]+" ");
                telement++;
            }
            bottomr--;

            for(int j = bottomr; j <= topr && telement < n; j--) {
                System.out.print(m[j][leftc]+" ");
                telement++;
            }
            leftc++;
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of row and colomn is : ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            int m[][] = new int[r][c];

            System.out.println("Enter the "+r*c+" size of matrix is : ");
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    m[i][j] = sc.nextInt();
                }
            }
            System.out.println("Matrix in the form of Spiral order is : ");
            spiralmatrixis(m, r, c);
            //printMatrix(m, r, c);
        }
    }
}
