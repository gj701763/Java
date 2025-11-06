//package DSA In Java.Strings in java;

public class ReverseStringWithoutSpeacialChar 
{
    public static void main(String[] args) {
        String str = "fg#fee$@!hjo*";
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (!Character.isAlphabetic(arr[i]))
                i++;
            else if (!Character.isAlphabetic(arr[j]))
                j--;
            else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        String s = new String(arr);
        System.out.println(s);
    }
}
