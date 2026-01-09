//package DSA In Java.Sliding_Windows;
/*   Longest Even Odd Subarray With Threshold

     You are given a 0-indexed integer array nums and an integer threshold.
     Find the length of the longest subarray of nums starting at index l and
     ending at index r (0 <= l <= r < nums.length) that satisfies the following conditions:
     1)nums[l] % 2 == 0
     2)For all indices i in the range [l, r - 1], nums[i] % 2 != nums[i + 1] % 2
     3)For all indices i in the range [l, r], nums[i] <= threshold
     Return an integer denoting the length of the longest such subarray.

     Note: A subarray is a contiguous non-empty sequence of elements within an array.
 * 
 */
public class ThresholdArr {
    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            // Start only if nums[i] is even and <= threshold
            if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                int length = 1;
                int prevParity = nums[i] % 2;

                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > threshold) break;

                    int currParity = nums[j] % 2;

                    // Check if parity alternates
                    if (currParity == prevParity) break;

                    length++;
                    prevParity = currParity;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 8, 9};
        int threshold = 10;
        System.out.println(longestAlternatingSubarray(nums, threshold)); // Output: 6
    }
}
