/*Rotate the given array 'a' by k steps, where k is non-negative.
   Note : k can be greater than n as well.*/
import java.util.*;
public class RotateArray {
    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for(int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.print("Enter the "+n+" size of array is : ");
            for(int i = 0 ; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the key is : "); 
            int k = sc.nextInt();
            printArray(arr);
            int ans[] = rotate(arr, k);
            printArray(ans);
        }
    }
}
