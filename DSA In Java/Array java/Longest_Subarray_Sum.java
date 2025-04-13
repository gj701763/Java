import java.util.Scanner;

/* LONGEST SUBARRAY WITH SUM K */

/* Give an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. if there is no subarray with sum equal to k, return 0. */

// arr[] = [10, 5, 2, 7, 1, -10], k = 15 
// outpur : - 6
public class Longest_Subarray_Sum {

    static int longestSum(int arr[], int k) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if(sum == k) {
            return k;
        }else{
            return 0;
        }
    }

    static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : "); 
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.print("Enter the Element of array is : ");
            for(int i = 0; i< arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            printArr(arr);
            
            System.out.print("Enter the Q keys : "); 
            int q = sc.nextInt();
            while (q-- > 0) {
                System.out.print("Enter the value of k is : ");
                int k = sc.nextInt();
                System.out.println("the outpt is "+ longestSum(arr,k));
            }
        }
    }
}
