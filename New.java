import java.util.Arrays;

public class New {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 5, 6};
        Arrays.sort(arr);  // ✅ sort works here
        print(arr);
    }
}
