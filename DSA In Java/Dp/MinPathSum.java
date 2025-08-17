import java.util.Arrays;

public class MinPathSum {

    private static int path(int arr[][], int r, int c, int dp[][]) {
        int n = arr.length;
        int m = arr[0].length;
        if (r >= n || c >= m)
            return Integer.MAX_VALUE;
        if (r == n - 1 && c == m - 1)
            return arr[r][c];
        if (dp[r][c] != -1)
            return dp[r][c];
        int down = path(arr, r + 1, c, dp);
        int right = path(arr, r, c + 1, dp);
        return dp[r][c] = arr[r][c] + Math.min(down, right);
    }

    public static int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return path(grid, 0, 0, dp);

    }

    public static void main(String[] args) {
        int grid[][] = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        System.out.println(minPathSum(grid));
    }
}
