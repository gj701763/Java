package DSA_In_Java.Strings_in_java;

public class P2531DiStinctCharactersEqual {
    public static boolean isItPossible(String word1, String word2) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i = 0; i < word1.length(); i++)
        {
            arr1[word1.charAt(i) -'a']++;
        }
        for(int i = 0; i < word2.length(); i++)
        {
            arr2[word2.charAt(i)-'a']++;
        }

        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] >= 2)
            {
                
            }
        }

        for(int i = 0; i < 26; i++)
        {
            System.out.println(arr1[i] +" " + arr2[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "abcc", word2 = "aab";
        System.out.println(isItPossible(word1, word2));
    }
}
