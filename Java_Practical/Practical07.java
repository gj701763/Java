// Program for sorting and searching a list of element 
import java.util.*;
public class Practical07 {

    static void print_Array(int arr[]) {  // Print the array 
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int BinarySearch(int arr[], int k){  // Binary Search
        int left = 0;
        int right = arr.length -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == k) {
                return mid;
            }
            if(arr[mid] < k) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array is : ");
            int n = sc.nextInt(); // size of array 
            int arr[] = new int[n];

            System.out.println("Enter the "+n+" size of array is : ");
            for(int i = 0; i < n; i++) {  // Input the array 
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < arr.length; i++) {  // Bubble Sorting
                for(int j = i+1; j < arr.length; j++) {
                    if(arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Sorted array is : ");
            print_Array(arr);
            System.out.println("Enter the key Element is : ");
            int k = sc.nextInt();
            System.out.println("Index found is : "+BinarySearch(arr, k));
        }
    }
}
