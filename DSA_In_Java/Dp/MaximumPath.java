import java.util.Arrays;

public class MaximumPath {

    public static int path(int arr[][], int r, int c, int dp[][]) {
        int n = arr.length; 
        int m = arr[0].length;
        if(r == n || c < 0 || c == m) return Integer.MIN_VALUE;
        if(r == n-1) return arr[r][c];
         if (dp[r][c] != -1) return dp[r][c];
        int left = path(arr, r+1, c-1, dp);
        int down = path(arr, r+1, c, dp);
        int right = path(arr, r+1, c+1, dp);
        return dp[r][c] = arr[r][c] + Math.max(down, Math.max(left, right));
    }

    public static int maximumPath(int arr[][]) {
        int n = arr.length; 
        int m = arr[0].length;
        int dp[][] = new int[n][m];

        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }
        int ans = -1;
        for(int i = 0; i < m; i++) {
            ans = Math.max(ans, path(arr, 0, i, dp));
        }
        return ans;
    }
    public static void main(String[] args) {

        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(maximumPath(arr));
    }
}
