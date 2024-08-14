import java.util.*;

public class BubbleSort {
    public static void printArray(int arr[]) {
        System.out.print("Sorted Array is : ");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of Array is : ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter your Array is : ");
            for(int i = 0; i < size ; i++) {
                arr[i] = sc.nextInt();
            }

            // Bubble Sort
            for(int i = 0; i < arr.length - 1; i++) {
                for(int j = 0; j < arr.length - i - 1; j++) {
                    if(arr[j] > arr[j+1]) {
                        // Swapping
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }

  }
}
