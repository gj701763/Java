package DSA_In_Java.Matrix;

// every row sum, every column sum and both diagonal sum are all equal.
public class LargestMagicSquare {

    public static int largestMagicSquare(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int k = Math.min(rows, cols); k > 1; k--) {
            for (int i = 0; i <= rows - k; i++) {
                for (int j = 0; j <= cols - k; j++) {
                    if (isMagic(grid, i, j, k))
                        return k;
                }
            }
        }
        return 1;
    }

    private static boolean isMagic(int[][] grid, int r, int c, int k) {
        int target = 0;
        for (int j = c; j < c + k; j++)
            target += grid[r][j];

        // Check Rows
        for (int i = r + 1; i < r + k; i++) {
            int rSum = 0;
            for (int j = c; j < c + k; j++)
                rSum += grid[i][j];
            if (rSum != target)
                return false;
        }

        // Check Cols
        for (int j = c; j < c + k; j++) {
            int cSum = 0;
            for (int i = r; i < r + k; i++)
                cSum += grid[i][j];
            if (cSum != target)
                return false;
        }

        // Check Diagonals
        int d1 = 0, d2 = 0;
        for (int i = 0; i < k; i++) {
            d1 += grid[r + i][c + i];
            d2 += grid[r + i][c + k - 1 - i];
        }
        return d1 == target && d2 == target;
    }

    public static void main(String[] args) {
        int arr[][] = { { 7, 1, 4, 5, 6 },
                { 2, 5, 1, 6, 4 },
                { 1, 5, 4, 3, 2 },
                { 1, 2, 7, 3, 4 } };
        System.out.println(largestMagicSquare(arr));
    }
}
