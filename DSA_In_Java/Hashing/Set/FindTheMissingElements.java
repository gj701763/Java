import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheMissingElements {
    public static List<Integer> findMissingElements(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
            set.add(num);
        }
        while (min < max - 1) {
            if (!set.contains(min + 1)) {
                list.add(min + 1);
            }
            min++;
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 6, 9 };
        int arr1[] = { 1, 4, 2, 5 };
        int arr2[] = { 5, 1 };
        List ans = findMissingElements(arr2);
        System.out.println(ans);
    }
}