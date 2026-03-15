package Leetcode;

import java.util.Stack;

public class P43MultiplyStrings {

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int n = num1.length(), m = num2.length();
        int[] pos = new int[n + m];

        // Multiply from right to left
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                // p1 is the 'tens' place (carry), p2 is the 'ones' place
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = sum % 10;
            }
        }

        // Convert the array back to a string
        StringBuilder sb = new StringBuilder();
        for (int p : pos) {
            // Skip leading zeros
            if (!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String num1 = "123456789", num2 = "987654321";
        //System.out.println(multiply(num1,num2));
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }
    
    public static String removeDuplicateLetters(String s) {
            int[] lastOccurrence = new int[26];
            for (int i = 0; i < s.length(); i++) {
                lastOccurrence[s.charAt(i) - 'a'] = i;
            }

            boolean[] seen = new boolean[26];
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char curr = s.charAt(i);

                // If we already have this char in our stack, skip it
                if (seen[curr - 'a'])
                    continue;

                // While the current char is smaller than the stack top
                // AND the stack top appears again later in the string...
                while (!stack.isEmpty() && curr < stack.peek() && i < lastOccurrence[stack.peek() - 'a']) {
                    seen[stack.pop() - 'a'] = false;
                }
                stack.push(curr);
                seen[curr - 'a'] = true;
            }
            StringBuilder sb = new StringBuilder();
            for (char c : stack)
                sb.append(c);
            return sb.toString();
        }
    
}
