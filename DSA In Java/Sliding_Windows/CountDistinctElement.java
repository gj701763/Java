//package DSA In Java.Sliding_Windows;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// arr = 1 2 2 1 3 1 1 3 
// k = 4
public class CountDistinctElement {
    public static int[] distict(int[] arr, int k) {
        int[] ans = new int[arr.length - k + 1];
        if (k > arr.length || k <= 0) {
            return new int[0];
        }
        int idx = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ans[idx++] = map.size();
        for (int i = k; i < arr.length; i++) {
            int elementToRemove = arr[i - k];
            int count = map.get(elementToRemove);
            if (count == 1) {
                map.remove(elementToRemove);
            } else {
                map.put(elementToRemove, count - 1);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            ans[idx++] = map.size();
        }
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : ");
            int n = sc.nextInt();
            System.out.print("Enter the array elements is : ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the window size is : ");
            int k = sc.nextInt();
            int[] res = distict(arr, k);
            for (int num : res) {
                System.out.print(num + " ");
            }
        }
    }
}
