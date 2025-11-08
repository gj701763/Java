
//package DSA In Java.Sliding_Windows;
/*
 * 560. Subarray Sum Equals K
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
 */
import java.util.*;

//import InterviewQue.string;

public class SubArryEqualK {

    @SuppressWarnings("unused")
    private static int subarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, sum = 0;
        map.put(0, 1);
        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static boolean subarray1(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (set.contains(sum - k)) {
                return true;
            } else
                set.add(sum);
        }

        return false;      
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : ");
            int n = sc.nextInt();
            System.out.println("Enter the elements of array is : ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the sum of window is : ");
            int k = sc.nextInt();
            // System.out.println(subarray(arr, k));
            System.out.println(subarray1(arr, k));
        }
    }
}
