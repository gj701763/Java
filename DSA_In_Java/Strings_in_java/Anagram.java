package DSA_In_Java.Strings_in_java;

public class Anagram {

    public static boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length()) return false;
        int arr[] = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            // char chS = s.charAt(i);
            // char chT = t.charAt(i);
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int ch : arr)
        {
            if(ch != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "margana";
        System.out.println(isAnagram(s, t));
    }
}
