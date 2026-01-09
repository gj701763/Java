package Hashing.Questions;
import java.util.*;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        boolean hasOdd = false;
        System.out.println(map);
        for (char c : map.keySet()) {
            int n = map.get(c);
            if (n % 2 == 0) {
                count = count + n;
            } else {
                count += n - 1;
                hasOdd = true;
            }
        }
        return hasOdd ? count + 1 : count;
    }

    public static void main(String[] args) {
        String s = "a"; /// output : 7
        System.out.println(longestPalindrome(s));
    }
}
