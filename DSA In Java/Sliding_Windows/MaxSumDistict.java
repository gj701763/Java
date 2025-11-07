/*
 * 2461. Maximum Sum of Distinct Subarrays With Length K

 * You are given an integer array nums and an integer k. Find the maximum
 * subarray sum of all the subarrays of nums that meet the following conditions:
 * The length of the subarray is k, and
 * All the elements of the subarray are distinct.
 * Return the maximum subarray sum of all the subarrays that meet the
 * conditions. If no subarray meets the conditions, return 0.
 * 
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *Example 1:
 * Input: nums = [1,5,4,2,9,9,9], k = 3
 * Output: 15
 */
import java.util.HashSet;
import java.util.Set;

public class MaxSumDistict
{
    public static long maximumSubarraySum(int[] arr, int k) 
    {
        Set<Integer> set = new HashSet<>();
        long sum = 0, max = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) 
        {
            while (set.contains(arr[right])) 
            {
                set.remove(arr[left]);
                sum -= arr[left];
                left++;
            }
            set.add(arr[right]);
            sum += arr[right];

            if (right - left + 1 > k) 
            {
                sum -= arr[left];
                set.remove(arr[left]);
                left++;
            }
            if (right - left + 1 == k) 
            {
                max = Math.max(max, sum);
            }
        }

        return max;
    }

    public static void main(String[] args) 
    {
        int[] arr = {1,5,4,2,9,9,9};
        System.out.println(maximumSubarraySum(arr, 3));
    }
}