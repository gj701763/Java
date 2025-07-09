/*  Contains Duplicate 
You are given an integer array nums and two integers indexDiff and valueDiff.

Find a pair of indices (i, j) such that:

i != j,
abs(i - j) <= indexDiff.
abs(nums[i] - nums[j]) <= valueDiff, and
Return true if such pair exists or false otherwise.

Input1: nums = [1,2,3,1], indexDiff = 3, valueDiff = 0
Output: true
Explanation: We can choose (i, j) = (0, 3).
We satisfy the three conditions:
i != j --> 0 != 3
abs(i - j) <= indexDiff --> abs(0 - 3) <= 3
abs(nums[i] - nums[j]) <= valueDiff --> abs(1 - 1) <= 0
 */
package Hashing.Questions;

import java.util.HashMap;

public class DuplicateElement {
    public static boolean containsNearbyAlmostDuplicate1(int[] arr, int indexDiff, int valueDiff) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(i - j) <= indexDiff && Math.abs((long) arr[i] - arr[j]) <= valueDiff) {
                    return true;
                }
            }
        }
        return false;
    }

    
    public boolean containsNearbyAlmostDuplicate(int[] arr, int indexDiff, int valueDiff) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            
            if(Math.acos((long)i - m.get(arr[i]) <= indexDiff) && Math.abs(arr[i] - m.containsValue(arr[i]) <= valueDiff))
            return true;
            m.put(arr[i], i);
        }
        
        

        return false;
    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 5, 9, 1, 5, 9 };
        int indexDiff = 2;
        int valueDiff = 3;
        System.out.println(containsNearbyAlmostDuplicate(arr, indexDiff, valueDiff));
    }
}
