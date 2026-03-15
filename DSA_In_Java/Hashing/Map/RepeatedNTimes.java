package DSA_In_Java.Hashing.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedNTimes {
    public static int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int n : nums) {
            int count = map.getOrDefault(n, 0) + 1;
            System.out.println(count);
            if (count > 1) {
                return n; 
            }
            map.put(n, count);
        }

        return -1; 
    }

    public static void main(String[] args) {
        int arr[] = {8,3,2,3};
        System.out.println(repeatedNTimes(arr));
    }
}
