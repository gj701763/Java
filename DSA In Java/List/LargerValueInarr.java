import java.util.*;

public class LargerValueInarr {
    public static int findMaxK(int[] arr) {
        int max = -1;
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }

        for (int num : set) {
            if (num > 0 && set.contains(-num)) {
                max = Math.max(max, num);
            }
        }
    
        return max;

    }   
    

      public static int findMaxKArr(int[] nums) {
    int max = -1;

    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] == -nums[j]) {
                max = Math.max(max, Math.abs(nums[i]));
            }
        }
    }

    return max;
}



        
        public static void main(String[] args) 
        {
            int arr[] = {-1,2,3,-3};
            System.out.println(findMaxKArr(arr));
       }
}
