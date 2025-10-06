import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from user : ");
        int n = sc.nextInt();

        for (int i = 2; i <= n - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
        sc.close();
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int j = 2; j * j <= num; j++) {
            if (num % j == 0) return false;
        }
        return true;
    }
    
}
