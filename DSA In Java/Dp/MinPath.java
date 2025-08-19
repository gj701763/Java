public class MinPath {

    public static int minFallingPathSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int dp[][] = new int[m][n];
        for (int j = 0; j < n; j++) {
            dp[m - 1][j] = arr[m - 1][j];
        }
        for (int i = m - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int down = dp[i + 1][j];
                int left = (j > 0) ? dp[i + 1][j - 1] : Integer.MAX_VALUE;
                int right = (j < n - 1) ? dp[i + 1][j + 1] : Integer.MAX_VALUE;

                dp[i][j] = arr[i][j] + Math.min(down, Math.min(left, right));
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, dp[0][j]);
        }

        return ans;
    }

    public static int minPath(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;
        int dp[][] = new int[m][n];

        // base case: first row = arr[first row]
        for (int j = 0; j < n; j++) {
            dp[0][j] = arr[0][j];
        }

        // build DP from top → bottom
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int up = dp[i - 1][j];
                int leftDiag = (j > 0) ? dp[i - 1][j - 1] : Integer.MAX_VALUE;
                int rightDiag = (j < n - 1) ? dp[i - 1][j + 1] : Integer.MAX_VALUE;

                dp[i][j] = arr[i][j] + Math.min(up, Math.min(leftDiag, rightDiag));
            }
        }

        // result = min in the last row
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, dp[m - 1][j]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
        System.out.println(minFallingPathSum(arr));
        System.out.println(minPath(arr));

    }
}
