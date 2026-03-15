package DSA_In_Java.Counting;

import java.util.HashMap;
import java.util.Map;

public class MaxDiff {
    private static final int HashMap = 0;

    public static int maxDifference(String s) {
        int arr[] = new int[32];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c - 'a']++;
        }

        int diff = 0;
        int eMax = 0;
        int oMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                eMax = Math.max(eMax, arr[i]);
            } else {
                oMax = Math.max(oMax, arr[i]);
            }
        }
        diff = eMax - oMax;
        return Math.abs(diff);
    }

    public static int maxDifference1(String s){
        Map<Character, Integer > map  = new HashMap<>();
        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        boolean foundOdd = false, foundEven = false;

        for(int val : map.values())
        {
            if(val % 2 == 0)
            {
                minEven = Math.min(val, minEven);
                foundEven = true;
            }else
            {
                maxOdd = Math.max(maxOdd, val);
                foundOdd = true;
            }
        }
        System.out.println(map);
        return (foundOdd && foundEven) ? (maxOdd - minEven) : 0;
    }

    public static void main(String[] args) {
        String s = "tzt";
        System.out.println(maxDifference1(s));
    }
}
