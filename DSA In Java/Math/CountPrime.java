import java.util.Arrays;
import java.util.Scanner;

public class CountPrime {
    public  static int[] countPrimes(int n) {
        
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime, true);

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        int count = 0;
        for (int p = 2; p <= n; p++) {
            if (prime[p]) count++;
        }

        int res[] = new int[count];
        int idx = 0;
        for (int p = 2; p < n; p++) {
            if (prime[p]) res[idx++] = p;
        }

        System.out.println(count);
 
        return res;

    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res[] = countPrimes(n);
        System.out.println(Arrays.toString(res));
        sc.close();

    }
}
