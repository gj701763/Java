/*  Check if we can partition the array into two subarrays with equal sum. More formally, 
    check that the prefix sum of a part of the array is equal to the suffix 
    sum of rest of the array.
*/
import java.util.*;
public class Sub_Array {

    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int finesum(int arr[]) {
        int totalsum = 0;
        for(int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        return totalsum;
    }

    static boolean euaulparition(int arr[]) {
        int totalsum = finesum(arr);
        int prefixsum = 0;
        for(int i = 0; i < arr.length; i++) {
            prefixsum += arr[i];
            int suffixsum = totalsum - prefixsum;
            if(suffixsum == prefixsum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array : " );
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter the "+n+" size of array is : ");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("to parition is : "+ euaulparition(arr));
        }

        

    }
}
