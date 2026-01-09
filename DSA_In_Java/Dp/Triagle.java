//package DSA In Java.Dp;
/*
 * Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
Output: 11
Explanation: The triangle looks like:
   2
  3 4
 6 5 7
4 1 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Triagle {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];

       
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                dp[col] = triangle.get(row).get(col) + Math.min(dp[col], dp[col + 1]);
            }
        }

        return dp[0];
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        // print triangle row-by-row
        for (List<Integer> row : triangle) {
            for (Integer v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
