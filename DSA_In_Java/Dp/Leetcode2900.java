import java.util.ArrayList;
import java.util.List;

public class Leetcode2900 {
    public static List<String> getLongestSubsequence(String[] words, int[] groups) 
    {
        int n = words.length;
        List<String> result = new ArrayList<>();
        if (n == 0)return result;
        result.add(words[0]); 

        for (int i = 1; i < n; i++) 
        {
            if (groups[i] != groups[i - 1]) 
            {
                result.add(words[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] words = { "a"};
        int[] groups = {1};
        System.out.println(getLongestSubsequence(words, groups));
    }
}
