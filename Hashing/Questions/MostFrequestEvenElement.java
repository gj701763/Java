package Hashing.Questions;

import java.util.HashMap;

/* Most Frequent Even Element
 * 
 * Given an integer array nums, return the most frequent even element.
   If there is a tie, return the smallest one. If there is no such element, return -1.
   Input: nums = [0,1,2,2,4,4,1]
   Output: 2
   Explanation:
   The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
We return the smallest one, which is 2.
 */
public class MostFrequestEvenElement {
    public static void mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] % 2 == 0) {
                if(map.containsKey(nums[i])) {
                    map.put(nums[i], map.get(nums[i]) + 1);
                }else{
                     map.put(nums[i], 1);
                }
            }else{
                System.out.println("even");
            }
            
        }

        for(int key : map.keySet()) {
            if(map.get(key) > n/3) {
                System.out.println(key);
            }
        }
       
    }
    public static void main(String[] args) {
        int nums[] = {29,47,21,41,13,37,25,7};
        mostFrequentEven(nums);
        
    }
    
}
