package Hashing.Questions;

import java.util.HashMap;

/*
 * Largest subarray with 0 sum
 * Given an array arr containing both positive and negative integers, the task is to compute the length of the largest subarray that has a sum of 0.
 * 
 * Input1: arr[] = [15, -2, 2, -8, 1, 7, 10, 23]
   Output: 5
   Explanation: The largest subarray with a sum of 0 is [-2, 2, -8, 1, 7].

   Input2: arr[] = [2, 10, 4]
   Output: 0
   Explanation: There is no subarray with a sum of 0.
 */
public class LargestSubarr {
    public static int zeroSubArr(int arr[]){
        HashMap<Integer, Integer> m = new HashMap<>();
        int maxL = 0;
        int priSum = 0;
        m.put(0, -1);
        for(int i = 0; i < arr.length; i++) {
            priSum += arr[i];
            if(m.containsKey(priSum)) {
                maxL = Math.max(maxL, i - m.get(priSum));
            }else{
                m.put(priSum, i);
            }
        }
        return maxL;
    }
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23,-33};
        System.out.println(zeroSubArr(arr));
    }
}
