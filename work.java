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
        int[][] arr = { { 7, 1, 5 }, { 4, 3, 4 }, { 6, 0, 9 } };
        int[][] arr2 = { { 7, 1, 5 }, { 4, 3, 4 }, { 6, 0, 9 } };
        int m = arr.length;
        int n = arr[0].length;
        int[][] arr3 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
