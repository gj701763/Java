import java.util.Arrays;

public class FibonacciS {
    static int dp[];
    private static int fibo(int n) {
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fibo(n-1) + fibo(n-2);
    }
    public static int fib(int n) {
        dp= new int[n+1];
        Arrays.fill(dp, -1);

        return fibo(n);
    }
    public static void main(String[] args) {
        int num = 6;
        System.out.println(fib(num));
    }
}
