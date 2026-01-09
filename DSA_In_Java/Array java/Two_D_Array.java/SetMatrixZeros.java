public class SetMatrixZeros {

    static void printArray(int d[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setZeros() {
        int matrix[][] = {{1,1,1},{1,0,1},{0,1,1}};
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] zeroRow = new boolean[m];
        boolean[] zeroCol = new boolean[n];

        // Step 1: find all zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        // Step 2: set rows & cols to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zeroRow[i] || zeroCol[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        printArray(matrix, m, n);
    }

    public static void main(String[] args) {
        setZeros();
    }
}
