package Leetcode;

import java.util.Stack;

public class P394DecodeString {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        String str = "";
        char arr[] = s.toCharArray();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= '0' && arr[i] <= '9')
            {
                int num = (int)arr[i];
            }
            else if(arr[i] == '[')
            {
                st.push('[');
            }else {
                
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        // aaabcbc
    }
}


