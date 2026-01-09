import java.util.*;
import java.util.Arrays;;

public class Solution {
    public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    result.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 }; // → triplets: (-1, -1, 2), (-1, 0, 1)
        List<?> list = threeSum(arr);
        System.out.println(list);
    }
}
