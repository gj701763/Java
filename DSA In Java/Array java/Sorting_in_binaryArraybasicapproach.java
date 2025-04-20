import java.util.*;
public class Sorting_in_binaryArraybasicapproach {

    static void sortingarray(int arr[]) {
        int zeros = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                zeros++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(i < zeros) {
                arr[i] = 0;
            }else {
                arr[i] = 1;
            }
        }
    }

    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.print("Enter the "+n+" size of array is : ");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
           // printArray(arr);
            sortingarray(arr);
            System.out.print("Sorted array is : ");
            printArray(arr);
        }
    }
}
