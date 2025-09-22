//Maximum Number of Words Found in Sentences
public class MaxNumWordsFoundSent {
    public static void main(String[] args) {
        String arr[] = {"alice and bob love leetcode", 
        "i think so too", "this is great thanks very much"};
        int max =Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            String str = arr[i];
            String regex = "[,\\.\\s]";
            String[] myArray = str.split(regex);
            max = Math.max(max, myArray.length);
        }

        System.out.println(max);
    }
}
