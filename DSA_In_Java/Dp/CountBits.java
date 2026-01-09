//package DSA In Java.Dp;

public class CountBits {
    private static void print(int arr[])
    {
        for(int n : arr)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
    
    private static int binaryFind(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 2; 
            n = n / 2; 
        }
        return sum;
    }

    public static int[] countBits(int n) {
        int dp[] = new int[n+1];
        for(int i = 1; i <= n; i++) {
           int sum = binaryFind(i);
           dp[i] = sum;
        }
        return dp;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans[] = countBits(n);
        print(ans);
    }
}
