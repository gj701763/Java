package Hashing.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * 1347. Minimum Number of Steps to Make Two Strings Anagram
You are given two strings of the same length s and t. 
In one step you can choose any character of t and replace it with another character.
Return the minimum number of steps to make t an anagram of s.
An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.

 
 */

public class ChangeChar {

    private static void print(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int minSteps(String s, String t) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        print(freq);

        for (char c : t.toCharArray())
            freq[c - 'a']--;
        print(freq);

        int count = 0;
        for (int val : freq)
            if (val > 0)
                count += val;

        return count;
    }

    public static int minSteps1(String s, String t) // ans 7
    {
        int[] freq = new int[26];
        int[] freq1 = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        print(freq);

        for (char c : t.toCharArray())
            freq1[c - 'a']++;
        print(freq1);
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] != freq1[i]) {
                count += Math.abs(freq[i] - freq1[i]);
            }
        }

        return count;
    }

    public static int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray())
            freq[c - 'a']++;

        Arrays.sort(freq); // ascending
        int total = 0, pos = 0;

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0)
                break;
            int press = pos / 8 + 1;
            total += freq[i] * press;
            pos++;
        }
        return total;
    }

    public static void main(String[] args) {
        String s = "aabbccddeeffgghhiiiiii";
        // System.out.println(minSteps(s,t));
        // System.out.println(minSteps1(s, t));
        System.out.println(minimumPushes(s));
    }
}
