package DSA_In_Java.Strings_in_java;

public class ReverseSegString {
    public static void reverse(char arr[], int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static String reversePrefix(String s, int d) {
        char arr[] = s.toCharArray();
        int n = s.length();
        d = d % n;

        reverse(arr, 0, d-1);
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "xyz";
        int k = 3;
        System.out.println(reversePrefix(s, k));
    }
}
