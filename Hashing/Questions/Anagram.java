package Hashing.Questions;

import java.util.*;

/* Check whether two Strings are anagram of each other. Return true if they are else return false.
 An anagram of a string is another string that contains the same characters, only the order of
  characters can be different. for ex, "abcd" and "dabc" are anagram of each other.
   input :- listen or silent -> true
   input :- anagram or grams -> false.
 * 
 */

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> m = new HashMap<>();
        if (s.length() != t.length())
            return false;

        for (char c : s.toCharArray()) {
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }

        }

        for (char c : t.toCharArray()) {
            if (!m.containsKey(c))
                return false;
            m.put(c, m.get(c) - 1);
            if (m.get(c) < 0)
                return false;
        }

        return true;

    }

    public static void main(String[] args) {
        String s = "silent";
        String t = "listen";
        System.out.println(isAnagram(s, t));
    }
}
