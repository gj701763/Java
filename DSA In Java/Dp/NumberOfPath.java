import java.util.Arrays;

public class NumberOfPath {

    private static int paths(int m, int n, int dp[][]) {
        if (m == 1 && n == 1)
            return 1;
        if (m == 0 || n == 0)
            return 0;
        if (dp[m][n] != -1)
            return dp[m][n];
        return dp[m][n] = paths(m, n - 1, dp) + paths(m - 1, n, dp);
    }

    public static int numberOfPath(int m, int n) {
        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return paths(m, n, dp);
    }

    public static void main(String[] args) {
        int m = 5, n = 5;
        System.out.println(numberOfPath(m, n));
    }
}
