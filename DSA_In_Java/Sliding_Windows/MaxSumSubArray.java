import java.util.*;

/*
 * 
 *  Maximum Sum of Any Subarray
Example:
Input: arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6 (subarray [4, -1, 2, 1])

 */
public class MaxSumSubArray {

    public static void findMaxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
        }

        
        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int maxSumArr(int arr[])
    {
        int maxSum = arr[0];
        int currSum = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            currSum = Math.max(arr[i], arr[i]+currSum);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.print("Enter the array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            //findMaxSubArray(arr);
            System.out.println(maxSumArr(arr));
        }
    }
}
