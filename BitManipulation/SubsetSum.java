package BitManipulation;

import java.util.ArrayList;
import java.util.List;

/*
 * Sum of All Subset XOR Totals

The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.

For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
Given an array nums, return the sum of all XOR totals for every subset of nums. 

Note: Subsets with the same elements should be counted multiple times.

An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b.
 */
public class SubsetSum {
    public static void main(String[] args) {
        int arr[] = {1, 3};
        int n = arr.length;

        int total = 1 << n; // total subsets = 2^n
     int s = 0;
     
        for (int mask = 0; mask < total; mask++) {
    
             int sum = 0; // reset sum for each subset
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum = sum ^ arr[i];  // add element to sum
                }
            }
            s += sum;
        }
        
        
    }
}