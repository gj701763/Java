//package DSA In Java.Hashing.Set;
import java.util.*;
public class SubStringWithDist 
{
 
    public static int countGoodSubstrings(String s) {
        int n = s.length();
        if (n < 3) {
            return 0;
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            char c1 = s.charAt(i - 2); 
            char c2 = s.charAt(i - 1); 
            char c3 = s.charAt(i);
            if (c1 != c2 && c1 != c3 && c2 != c3) 
            {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(countGoodSubstrings(s));
    }
}

