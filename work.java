import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import java.util.Iterator;
import java.util.List;

public class work {

    private static void print(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int arr : nums) {
            map.put(arr, map.getOrDefault(arr, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> n : map.entrySet()) {
            if (n.getValue() == 2) {
                keys.add(n.getKey());
            }
        }
        int[] arr = new int[keys.size()];

        for (int i = 0; i < keys.size(); i++) {
            arr[i] = keys.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2 };
        int[] res = getSneakyNumbers(arr);
        print(res);
    }
}
