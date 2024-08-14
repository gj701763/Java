import java.util.*;

public class InsertionSort {
    public static void printArray(int arr[]) {
        System.out.print("Sorted array is : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter the array is : ");
            for(int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Insertion Sorting 
            for(int i = 1; i < arr.length; i++) {
                int current = arr[i];
                int j = i - 1;
                while(j >= 0 && current < arr[j]) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = current;
            }
            printArray(arr);
        }
    }
    
}
