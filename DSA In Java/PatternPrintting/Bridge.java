import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nost = 1;
        for(int i = 1; i <= n+1; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(" * ");
            }
            for(int j = 2; j <= nost; j++) {
                System.out.print("   ");
            }
            nost += 2;
            for(int j = 1; j <= n+1-i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
