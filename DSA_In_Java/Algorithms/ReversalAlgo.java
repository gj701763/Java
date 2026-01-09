
//package DSA In Java.Algorithms;
/*For a left rotation by d positions : 
Reverse the first d elements.
Reverse the remaining n-d elements.
Reverse the entire array.

For a right rotation by d positions : 
Reverse the entire array.
Reverse the first d elements.
Reverse the remaining n - d elements.

 */
import java.util.*;
public class ReversalAlgo {

    static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotateRight(int arr[], int d)
    {
        int n = arr.length;
        if (n == 0 || d % n == 0) {
            return; // No rotation needed
        }
        d = d % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
    }
    static void rotateLeft(int arr[], int d) {  
        int n = arr.length;
        if (n == 0 || d % n == 0) {
            return; // No rotation needed
        }
        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.print("Enter the elements of the array: "); // 1 2 3 4 5 6 7
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.err.print("enter the d is : ");
            int d = sc.nextInt();
            System.out.print("Original Array: ");
            printArray(arr);
            rotateLeft(arr, d); // d = 2
            System.out.print("\nRotate the left side of array ");
            printArray(arr);
            rotateRight(arr, d);
            System.out.print("\nRotate the right side or array ");
            printArray(arr);
        }
    }
}
