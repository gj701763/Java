import java.util.*;

public class RemoveDupl {
    public static String removeDuplicateLetters(String s) {
        Set<String> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            set.add(String.valueOf(c)); // Convert char to String before adding
        }

        String result = String.join("", set);
        return result;
    }

    public static void main(String[] args) {
        String s = "bcabc";
        String res = removeDuplicateLetters(s);
        System.out.println(res);
    }
}
