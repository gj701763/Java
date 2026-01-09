package DSA_In_Java.Matrix;

/*
You are given an n x n integer matrix. You can do the following operation any number of times:
Choose any two adjacent elements of matrix and multiply each of them by -1.
Two elements are considered adjacent if and only if they share a border.
Your goal is to maximize the summation of the matrix's elements. Return the maximum sum of the matrix's elements using the operation mentioned above.
*/

public class MaxMatrixSum {
    public static long maxMatrixSum(int[][] matrix) 
    {
        long totalAbsSum = 0;
        int minAbsValue = Integer.MAX_VALUE;
        int negativeCount = 0;

        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                int val = matrix[i][j];

                // 1. Track total absolute sum
                totalAbsSum += Math.abs(val);

                // 2. Track the smallest absolute value in the whole matrix
                minAbsValue = Math.min(minAbsValue, Math.abs(val));

                // 3. Count total negatives
                if (val < 0) {
                    negativeCount++;
                }
            }
        }

        // If negative count is odd, we must subtract the smallest value twice
        // (once because it was added to totalAbsSum, once to make it negative)
        if (negativeCount % 2 != 0) {
            return totalAbsSum - 2L * minAbsValue;
        }

        return totalAbsSum;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1,2,3},{-1,-2,-3},{1,2,3 } };
        System.out.println(maxMatrixSum(matrix));
    }
}