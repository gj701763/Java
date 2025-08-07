import java.util.*;
public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Row is : ");
        int row = sc.nextInt();
        System.out.print("Enter the size of column is : ");
        int col = sc.nextInt();
        int midrow = 1 + (row - 1) / 2;
        int midcol = 1 + (col -1) / 2;
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                if(i == midrow || j == midcol) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
