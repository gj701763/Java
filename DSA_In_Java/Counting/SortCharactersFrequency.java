
//In Java.Counting;
import java.util.Arrays;

public class SortCharactersFrequency {

    public static void reverse(int[][] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int[] temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static String frequencySort(String s) {
        int[][] freq = new int[128][2];
        for (int i = 0; i < 128; i++) {
            freq[i][1] = i;
        }

        // 2. Count frequencies
        for (char c : s.toCharArray()) {
            freq[c][0]++;
        }

        Arrays.sort(freq, (a, b) -> Integer.compare(b[0], a[0]));
        // reverse(freq);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            int count = freq[i][0];
            char character = (char) freq[i][1];

            if (count == 0)
                break;
            for (int j = 0; j < count; j++) {
                sb.append(character);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println("Result: " + frequencySort(s));
    }
}