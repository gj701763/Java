
//package DSA In Java.Sliding_Windows;
import java.util.*;
public class MaxSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the array element is : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the Slide of array is : ");
            int size = sc.nextInt();
            int result = maxSum(arr, size);
            System.out.println(result);
        }
    }
    public static int maxSum(int arr[], int w) {
        int n = arr.length;
        int current = 0;
        for (int i = 0; i < w; i++) {
            current += arr[i];
        }
        int maxS = current;
        // Slide the window
        for (int i = 1; i <= n - w; i++) {
            current = current + arr[i + w - 1] - arr[i - 1];
            maxS = Math.max(maxS, current);
        }
        return maxS;
    }
}
