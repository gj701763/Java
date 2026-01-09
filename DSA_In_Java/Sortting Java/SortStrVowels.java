import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class SortStrVowels {
    public static String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowels.add(c);
            }
        }
        vowels.sort((a, b) -> a - b);
        StringBuilder result = new StringBuilder();
        int v = 0;
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                result.append(vowels.get(v++));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "lEetcOde";
        String str = sortVowels(s);
        System.out.println(str);
    }
}
