package Hashing.Questions;

import java.util.HashMap;

/*  Given an Integer array of size n, find all elements that appear more than [n/3] times.
    nums[] = {1,3,2,5,1,3,1,5,1}; // Ans = 1
    nums[] = {1,2};   // Ans = 1,2
*/
public class MajorityElements {

    public static void MajorityElements(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }

        for(int key :map.keySet()) {
            if(map.get(key) > n/3) {
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args){
        //int nums[] = {1,3,2,5,1,3,1,5,1};
        int nums[] = {1,2};
        MajorityElements(nums);
    }
        
}
