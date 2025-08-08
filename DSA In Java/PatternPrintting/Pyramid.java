import java.util.*;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nos = n-1;
        int nost = 1;
        for(int i = 1; i <= n; i++) {
            // for(int j = 1; j <= n+1-i; j++) {
            //     System.out.print("   ");
            // }

            // for(int j = 1; j <= 2*i-1; j++) {
            //     System.out.print(" * ");
            // }
            // System.out.println();
            for(int j = 1; j <= nos; j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= nost; j++) {
                System.out.print(" * ");
            }
            nos -= 1;
            nost += 2;

            System.out.println();
        }
        sc.close();
    }
}
