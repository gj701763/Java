import java.util.*;
public class OddNumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int idx = 1;
            for(int j = 1; j <= i; j++) {
                System.out.print(idx+ " ");
                idx += 2;
            }
            System.out.println();
        }

        sc.close();
    }
}
