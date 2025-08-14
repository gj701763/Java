import java.util.*;

// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
public class MobileDigit {

    public static List<String> letterCombinations(String digits) {
        String arr[] = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        Map<Integer, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return list;
        }

        int idx = 0;
        for (int i = 2; i <= 9; i++) {
            map.put(i, arr[idx++]);
        }

        backtrack(map, digits, 0, new StringBuilder(), list);
        return list;
    }

    private static void backtrack(Map<Integer, String> map, String digits, int index, StringBuilder path, List<String> list) {
        // Base case: if we've formed a combination of full length
        if (index == digits.length()) {
            list.add(path.toString());
            return;
        }

        int digit = digits.charAt(index) - '0'; // convert char to int
        String possibleLetters = map.get(digit);

        for (char ch : possibleLetters.toCharArray()) {
            path.append(ch);              // choose
            backtrack(map, digits, index + 1, path, list); // explore
            path.deleteCharAt(path.length() - 1);          // un-choose (backtrack)
        }
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
