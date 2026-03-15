package Questions;

import java.util.HashMap;
import java.util.Map;

public class MaxSubstringWithDistinctStart {
    public static int maxDistinct(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        return map.size();
    }

    public static void main(String[] args) {
        String s = "abab";
        System.out.println(maxDistinct(s));
    }
}

public int lengthOfLongestSubstring(String s) {
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