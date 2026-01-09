//import java.util.Arrays;

public class MinPathSum {

    // private static int path(int arr[][], int r, int c, int grid[][]) {
    //     int n = arr.length;
    //     int m = arr[0].length;
    //     if (r >= n || c >= m)
    //         return Integer.MAX_VALUE;
    //     if (r == n - 1 && c == m - 1)
    //         return arr[r][c];
    //     if (grid[r][c] != -1)
    //         return grid[r][c];
    //     int down = path(arr, r + 1, c, grid);
    //     int right = path(arr, r, c + 1, grid);
    //     return grid[r][c] = arr[r][c] + Math.min(down, right);
    // }

    // public static int minPathSum(int[][] grid) {
    //     int n = grid.length;
    //     int m = grid[0].length;
    //     int grid[][] = new int[n][m];
    //     for (int i = 0; i < n; i++) {
    //         Arrays.fill(grid[i], -1);
    //     }
    //     return path(grid, 0, 0, grid);

    // }

    private static int minPSum(int grid[][]) {
        int n = grid.length, m = grid[0].length;

        for (int j = 1; j < m; j++) {
            grid[0][j] = grid[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < n; i++) {
            grid[i][0] = grid[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                grid[i][j] = grid[i][j] + Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }

        return grid[n - 1][m - 1];
    }

    public static void main(String[] args) {
        int grid[][] = { { 1, 3, 1 },
                { 1, 5, 1 },
                { 4, 2, 1 } };
        // System.out.println(minPathSum(grid));
        System.out.println(minPSum(grid));
    }
}
