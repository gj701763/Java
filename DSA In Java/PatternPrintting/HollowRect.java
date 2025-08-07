import java.util.*;

public class HollowRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int row = sc.nextInt();
        System.out.print("Enter the column : ");
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   "); // spacing for hollow part
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
