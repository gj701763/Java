import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n) { // 0 1 1 2 3 5 8
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt();
            int i = 0;
            while(i <= n)
            {
                System.out.println(fib(i++));
            }
        }
    }
}
