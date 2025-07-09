package Hashing.Questions;

import java.util.HashMap;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        int maxL = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);

            if (m.containsKey(ch)) {
                start = Math.max(m.get(ch) + 1, start);
            }
            m.put(ch, i);
            maxL = Math.max(maxL, i - start + 1);
        }
        return maxL;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
