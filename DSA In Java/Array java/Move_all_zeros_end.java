import java.util.Scanner;

public class Move_all_zeros_end {

    static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    static void Move_to_End(int[] arr) {
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) { // Fix: changed <= to <
            if (arr[i] != 0) {
                if (i != nonZeroIndex) {
                    int temp = arr[i];
                    arr[i] = arr[nonZeroIndex];
                    arr[nonZeroIndex] = temp;
                }
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Original Array: ");
            printArray(arr);
            Move_to_End(arr);
            System.out.print("After moving zeroes to end: ");
            printArray(arr);
        }
    }
}
