package MiniProject;
import java.util.*;

public class snekeLadder 
{
    static class Cell 
    {
        int position;
        int moves;

        Cell(int position, int moves) 
        {
            this.position = position;
            this.moves = moves;
        }
    }

    public static int minDiceThrows(int[] board, int n) {
        boolean[] visited = new boolean[n];
        Queue<Cell> queue = new LinkedList<>();

        // Start from the first cell
        queue.add(new Cell(0, 0));
        visited[0] = true;

        while (!queue.isEmpty()) {
            Cell current = queue.poll();

            // If we reach the last cell, return the number of moves
            if (current.position == n - 1) {
                return current.moves;
            }

            // Simulate dice rolls (1 to 6)
            for (int dice = 1; dice <= 6; dice++) {
                int nextPos = current.position + dice;

                if (nextPos < n && !visited[nextPos]) {
                    visited[nextPos] = true;

                    // Check for snake or ladder
                    int finalPos = board[nextPos] != -1 ? board[nextPos] : nextPos;

                    queue.add(new Cell(finalPos, current.moves + 1));
                }
            }
        }
        return -1; // If no path exists
    }

    public static void main(String[] args) {
        int n = 30; // Board size
        int[] board = new int[n];
        Arrays.fill(board, -1);

        // Ladders
        board[2] = 21;
        board[4] = 7;
        board[10] = 25;
        board[19] = 28;

        // Snakes
        board[26] = 0;
        board[20] = 8;
        board[16] = 3;
        board[18] = 6;

        System.out.println("Minimum dice throws required: " + minDiceThrows(board, n));
    }
}


