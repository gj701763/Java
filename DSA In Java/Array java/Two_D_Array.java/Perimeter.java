public class Perimeter {
    public static int islandPerimeter(int[][] grid) {
        int row = grid.length, col = grid[0].length, per = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    // check UP
                    if (i == 0 || grid[i - 1][j] == 0) per++;
                    // check DOWN
                    if (i == row - 1 || grid[i + 1][j] == 0) per++;
                    // check LEFT
                    if (j == 0 || grid[i][j - 1] == 0) per++;
                    // check RIGHT
                    if (j == col - 1 || grid[i][j + 1] == 0) per++;
                }
            }
        }

        return per;
    }
    public static void main(String[] args) {
        int[][] grid = {{1,1,0,0},{1,1,1,0},{0,1,1,0},{1,1,0,1}};
        System.out.println(islandPerimeter(grid));
    }
}
