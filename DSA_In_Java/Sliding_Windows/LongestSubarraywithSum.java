
/*
nums = [2, 5, 1, 7, 10]
K = 14
Output = 3
Subarray: [2, 5, 1]
 */

import java.util.Scanner;
public class LongestSubarraywithSum {

    public static int longestSubarraySumAtMostK(int[] nums, int k) {
        int left = 0, sum = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > k) {
                sum -= nums[left];
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the array element is : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the Slide of array is : ");
            int size = sc.nextInt();
            int result = longestSubarraySumAtMostK(arr, size);
            System.out.println(result);
        }
    }

}
