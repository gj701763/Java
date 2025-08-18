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

    public static int paths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }

            }
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int m = 3, n = 5;
        System.out.println("----"+ " Memoization Method"+"-------");
        System.out.println(numberOfPath(m, n));
        System.out.println("----"+ " Tabulation Method"+"-------");
        System.out.println(paths(m, n));
    }
}
