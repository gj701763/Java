package DSA_In_Java.Strings_in_java;

//Maximum Number of Words Found in Sentences
public class MaxNumWordsFoundSent {
    public static void main(String[] args) {
        String arr[] = {"alice and bob love leetcode", 
        "i think so too", "this is great thanks very much"};
        int maxword =Integer.MIN_VALUE, maxLength = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            String str = arr[i];
            String regex = "[,\\.\\s]";
            String[] myArray = str.split(regex);
            maxword = Math.max(maxword, myArray.length);
            for (String word : myArray) {
                maxLength = Math.max(maxLength, word.length());
            }
        }

        System.out.println("Max word in Sentences is : "+maxword);
        System.out.println("Math length word in Sentences is : "+ maxLength);
    }
}
