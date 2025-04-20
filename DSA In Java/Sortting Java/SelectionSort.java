import java.util.*;


public class SelectionSort {
    public static void printArray(int arr[]) {
        System.out.print("Sorted array is : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your size of array is : ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter your array is : ");
            for(int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Selection Sort

            for(int i = 0; i < arr.length - 1; i++) {
                int smallest = i;
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[smallest] > arr[j]) {
                        smallest = j;
                    }
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
            printArray(arr);
        }
        
    }
}
