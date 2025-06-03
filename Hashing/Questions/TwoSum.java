package Hashing.Questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import InterviewQue.String.string;

/* Given an array of length n and a target, return a pair(indices) whose sum is equal to the target.
   if there no pair present, return -1.

   input1 :- n = 4
            arr[] = {1,5,7,-1}
            target = 6
    output1 :- 0 1
 * 
 */

public class TwoSum {

    // public static List<Integer> twoSum(int arr[], int target) { // brute-force
    // approach
    // int n = arr.length;
    // List<Integer> l = new ArrayList<>();
    // for(int i = 0; i < n-1; i++) {
    // for(int j = i+1; j < n; j++) {
    // if(arr[i] + arr[j] == target) {
    // l.add(i);
    // l.add(j);
    // return l;
    // }
    // }
    // }
    // l.add(-1);
    // return l;
    // }

    public static int[] twoSum(int arr[], int target) {
        int n = arr.length;
        int ans[] = { -1 };
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int partner = target - arr[i];
            if (m.containsKey(partner)) {
                ans = new int[] { i, m.get(partner) };
                return ans;
            } else {
                m.put(arr[i], i);
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, -1, 4, 5, 3, 6, 2 };
        int target = 10;
        System.out.println(twoSum(arr, target));
    }

}
