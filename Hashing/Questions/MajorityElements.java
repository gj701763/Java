package Hashing.Questions;

import java.util.HashMap;
import java.util.Map;

/*  Given an Integer array of size n, find all elements that appear more than [n/3] times.
    nums[] = {1,3,2,5,1,3,1,5,1}; // Ans = 1
    nums[] = {1,2};   // Ans = 1,2
*/
public class MajorityElements {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int key :map.keySet()) {
            if(map.get(key) > n/2) {
                return key;
            }
        }

        return -1;
    }
    
    public static int majorityElement1(int[] arr) {
        int n = arr.length;
        int can = arr[0];
        int vote = 1;
        for(int i = 1; i < n; i++)
        {
            if(vote == 0)
            {
                can = arr[i];
                vote = 1;
            }else if(can == arr[i]) vote++;
            else vote--;
        }

        return can;
    }
    public static void main(String[] args){
        //int nums[] = {1,3,2,5,1,3,1,5,1};
        int nums[] = { 3, 2, 3,2};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement1(nums));

    }
        
}
