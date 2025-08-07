import java.util.*;
public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Row is : ");
        int row = sc.nextInt();
        System.out.print("Enter the size of column is : ");
        int col = sc.nextInt();
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                if(i == j || j == col + 1 - i) {
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
