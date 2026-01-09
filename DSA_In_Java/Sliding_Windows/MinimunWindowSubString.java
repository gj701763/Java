import java.util.ArrayList;
import java.util.HashMap;

public class MinimunWindowSubString {
    public static String minWindow(String s, String t) {
        int m = s.length(), n = t.length();
        if (m == n)
            return s;
        if (m < n)
            return "";
        String str = " ";
        ArrayList<Character> list = new ArrayList<>();
        for (char c : t.toCharArray()) {
            list.add(c);
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int minL = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.size() > 1 && list.contains(c)) {
                start = Math.min(map.get(c) + 1, start);
            }
            map.put(c, i);
            minL = Math.min(minL, i - start + 1);
        }
        System.out.println(minL);
        return str;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC"; // BANC
        String str = minWindow(s, t);
        System.out.println(str);
    }
}

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum < target)
                        k++;
                    else if (sum > target)
                        l--;
                    else {
                        result.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k - 1])
                            k++;
                        while (k < l && arr[l] == arr[l + 1])
                            l--;
                    }
                }
            }
        }
        return result;
    }
}