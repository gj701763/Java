/*For example, if word = "abcdefd" and ch = "d", 
then you should reverse the segment that starts at 0 and ends at 3 (inclusive). 
The resulting string will be "dcbaefd".
Return the resulting string. */


public class ReversePrefix {

    public static void reverse(char[] arr, int i, int j) {
    
    while (i < j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
}


    public static String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch); // find first occurrence of ch
        if (idx == -1) return word; // if ch not found, return original word

        char[] arr = word.toCharArray();
        reverse(arr, 0, idx); // reverse prefix [0..idx]

        return new String(arr);
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }
}
