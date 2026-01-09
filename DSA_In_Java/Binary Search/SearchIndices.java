import java.util.*;
import java.util.Arrays;
import java.util.List;

public class SearchIndices {
    public static List<Integer> targetIndices(int[] arr, int target) {
        Arrays.sort(arr); // step 1: sort the array
        List<Integer> list = new ArrayList<>();

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        // if target not found, return empty list
        if (first == -1) return list;

        // add all indices from first to last
        for (int i = first; i <= last; i++) {
            list.add(i); // autoboxing int to Integer is fine here
        }

        return list;
    }

    private static int firstOccurrence(int[] arr, int tar) {
        int low = 0, high = arr.length - 1, idx = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == tar) {
                idx = mid;
                high = mid - 1; // search left
            } else if (arr[mid] > tar) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return idx;
    }

    private static int lastOccurrence(int[] arr, int tar) {
        int low = 0, high = arr.length - 1, idx = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == tar) {
                idx = mid;
                low = mid + 1; // search right
            } else if (arr[mid] > tar) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 3, 2 };
        System.out.println(targetIndices(arr, 2));
    }
}
