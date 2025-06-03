package Hashing.Questions;

import java.util.HashMap;

/* Given two strings s and t, determine if they are isomorphic.
   Two strings s and t are isomorphic if the characters in s can be replaced to get t.
   
   All occurrences of a character must be replaced with another character while presering the order of character.
   No two characters may map to the same character, but a character may map to itself.

   Input1 -> aab or xxy = true

   Input2 -> abcdec or viouog = false
 * 
 */

public class IsomorphicStr {

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> m = new HashMap<>();
        if (s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++) {
            Character sch = s.charAt(i);
            Character tch = t.charAt(i);
            if(m.containsKey(sch)) {
                    if(m.get(sch) != tch) return false;
            }else if (m.containsValue(tch)) {
                return false;
            }else {
                m.put(sch, tch);
            }
        }
        

        return true;
    }

    public static void main(String[] args) {
    
        String s = "aab";
        String t = "cxy";
        System.out.println(isIsomorphic(s, t));
    }
}
