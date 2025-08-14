import java.util.*;

// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
public class MobileDigit {

    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();

        String[] arr = { "","", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz" };

        List<String> result = new ArrayList<>();
        result.add(""); // start with empty string

        for (char digitChar : digits.toCharArray()) {
            int digit = digitChar - '0';
            String letters = arr[digit];

            List<String> temp = new ArrayList<>();
            for (String prefix : result) {
                for (char letter : letters.toCharArray()) {
                    temp.add(prefix + letter);
                }
            }
            result = temp; // move to next level
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yout Stirng is : ");
        String digits = sc.next();

        List res = letterCombinations(digits);
        System.out.println(res);

        sc.close();
    }
}
