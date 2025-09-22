import java.util.*;

public class CheckStrAcronymWords {
    public static boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length())
            return false;
        Iterator<String> it = words.iterator();

        int i = 0;
        while (it.hasNext()) {
            if ((it.next().charAt(0)) != s.charAt(i++)) {
                return false;
            }
        }
        

        return true;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("dvn");
        words.add("acafe");
      
        String s = "da";
        System.out.println(isAcronym(words, s));

    }
}
