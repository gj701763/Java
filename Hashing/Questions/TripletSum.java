package Hashing.Questions;

import java.util.HashSet;
/*
 * Triplet Sum in Array
 * 
   Given an array arr[] and an integer target, determine if there exists a triplet in the array whose sum equals the given target.
   Return true if such a triplet exists, otherwise, return false.

   Input1: arr[] = [1, 4, 45, 6, 10, 8], target = 13 
   Output: true 
   Explanation: The triplet {1, 4, 8} sums up to 13

   Input2: arr[] = [40, 20, 10, 3, 6, 7], target = 24 
   Output: false 
   Explanation: No triplet in the array sums to 24
 */

public class TripletSum {
    public static boolean hasTripletSum(int arr[], int target) {
        // Your code Here
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (s.contains(target - (arr[i] + arr[j]))) {
                    return true;
                }
            }
            s.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        int target = 13;
        System.out.println(hasTripletSum(arr, target));

    }
}
