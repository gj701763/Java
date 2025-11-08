//package DSA In Java.Sliding_Windows;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Maximum Sum of Any Subarray
Example:
Input: arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6 (subarray [4, -1, 2, 1])

 */


public class FindSubArrWithSumK {

    public static void findSubArr(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0, start = 0, end = -1;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum == k) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(currSum - k)) {
                start = map.get(currSum - k) + 1;
                end = i;
                break;
            }
            map.put(currSum, i);
        }
        if (end == -1) {
            System.out.println("Subarray not found");
        } else {
            System.out.print("Subarray: ");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.print("Enter array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the sum k: ");
            int k = sc.nextInt();

            findSubArr(arr, k);
        }
    }
}
