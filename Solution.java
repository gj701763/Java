import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int value : map.values()) {
            if (value != 0)
                return false;
        }

        return true;
    }

    public static boolean isAnagramBest(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0)
                return false;
        }
        return true;
    }

    public static void Longest(int arr[]) {
        Arrays.sort(arr);
        int count = 1, max = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else if (arr[i] != arr[i - 1]) {
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);

        System.out.println(max);
    }

    public static boolean word(String s, String t) {

        String[] arr = t.split(" ");
        if (s.length() != arr.length)
            return false;

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            String word = arr[i];

            // Check char → word
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word))
                    return false;
            } else {
                charToWord.put(c, word);
            }

            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c)
                    return false;
            } else {
                wordToChar.put(word, c);
            }
        }

        return true;
    }

    public static void appearsOnlyOnce(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum ^= arr[i];
        }
        System.out.println(sum);
    }

    public static void strings(String s) {
        char arr[] = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '1' && arr[i + 1] != '1') {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }
        System.out.println(count);
    }

    public static char charsjd(String s, int k) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!(ch >= '0' && ch <= '9')) {
                // If it's a letter, just add it
                str = str + ch;
            } else {
                // Convert char '3' to int 3
                int num = ch - '0';

                // We need a temporary copy of the current string to repeat it
                String currentPattern = str;
                for (int j = 0; j < num - 1; j++) {
                    str = str + currentPattern;
                }
            }
        }

        System.out.println("Full decoded string: " + str);

        // Return the character at the k-th position (using 1-based indexing)
        return str.charAt(k - 1);
    }

    public static void rearrange(int arr[]) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int n : arr) {
            if (n < 0)
                list.add(n);
            else
                list2.add(n);
        }
        int iP = 0, iN = 0;
        for (int i = 0; i < arr.length; i++) {
            // Fill positive if index is even AND we have positives left,
            // OR if we've run out of negative numbers.
            if ((i % 2 == 0 && iP < list2.size()) || iN >= list.size()) {
                arr[i] = list2.get(iP++);
            } else {
                arr[i] = list.get(iN++);
            }
        }
        for (int num : arr)
            System.out.print(num + " ");
    }

    public static char firstUnique(String s) {
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }

        }

        return 'a';

    }

    public static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(map);
        for (int i = 0; i < map.size() - 1; i++) {

            System.out.println(map.get(i));
            if (map.get(i) == map.get(i + 1))
                return false;
        }
        return true;
    }

    public static String interpret(String s) {
        String str = "";
        char arr[] = s.toCharArray();
        int i = 0;
        while (i < s.length() - 1) {
            if (arr[i] == 'G') {
                str += 'G';
                i++;
            } else if (arr[i] == '(' && arr[i + 1] == ')') {
                str += 'o';
                i++;
            } else if (arr[i] == '(' && arr[i + 1] != ')') {
                str += 'a';
                str += 'l';
                i++;
            } else {
                i++;
            }
        }

        if (arr[arr.length - 1] == 'G')
            str += "G";
        return str;
    }

    public static String compress(String s) {
        String str = "";
        int count = 1;
        char arr[] = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                str += arr[i - 1] + "" + count;
                count = 1;
            }
        }
        str += arr[s.length() - 1] + "" + count;
        return str;
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                map2.put(list2[i], i + (int) map.get(list2[i]));
            }
        }

        int min = Integer.MAX_VALUE, count = 0, i = 0;
        for (int val : map2.values()) {
            if (min > val) {
                min = val;
            }
        }
        for (int val : map2.values()) {
            if (val == min) {
                count++;
            }
        }
        String str[] = new String[count];
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            if (entry.getValue() == min) {
                str[i++] = entry.getKey();
            }
        }
        System.out.println(min);
        System.out.println(map2);
        return str;
    }

    public static int[] findErrorNums(int[] arr) {
        int a[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            a[arr[i]]++;
        }
        int ans[] = new int[2];
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 2) {
                ans[0] = i;
            }
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isSelfDividing(int num) {
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 1, right = 22;
        List ans = selfDividingNumbers(left, right);
        System.out.println(ans);
    }

}
