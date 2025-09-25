package Hashing.HashMap;

import java.util.*;

//Count Elements With Maximum Frequency

public class Fre {
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int arr : nums) {
            map.put(arr, map.getOrDefault(arr, 0) + 1);
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            max = Math.max(max,entry.getValue());
            if(max == entry.getValue()) {
                  sum += entry.getValue();
               }
        }

        return sum;

    }
   public static void main(String[] args) {
    int arr[] = {1,2,2,3,1,4};
    System.out.println(maxFrequencyElements(arr));
   }

}

