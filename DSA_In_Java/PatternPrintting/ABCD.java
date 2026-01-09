import java.util.*;
public class ABCD {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the N : ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    System.out.print((char)(i+64) + " ");
                }
                System.out.println();
            }

            System.out.println("-----!!!!!---------");
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    System.out.print((char)(j+64) + " ");
                }
                System.out.println();
            }

        }
    }
}
