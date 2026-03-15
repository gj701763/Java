package DSA_In_Java.Strings_in_java;

public class ReverseVolesString {
    public static void main(String[] args) {
        String str = "IceCreAm";
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {

            if (!isVowel(arr[left])) {
                left++;
            } else if (!isVowel(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.print("Reversed vowels: ");
        System.out.println(new String(arr));
    }
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}