public class Shift2DGrid {
    public static int[][] shiftGrid(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int total = m * n;

        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int idx = i * n + j; // flatten 2D → 1D
                int newIdx = (idx + 1) % total; // shift right by 1
                int newRow = newIdx / n; // back to 2D
                int newCol = newIdx % n;
                ans[newRow][newCol] = arr[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] shifted = shiftGrid(arr);

        // print shifted grid
        for (int i = 0; i < shifted.length; i++) {
            for (int j = 0; j < shifted[0].length; j++) {
                System.out.print(shifted[i][j] + " ");
            }
            System.out.println();
        }
    }
}
