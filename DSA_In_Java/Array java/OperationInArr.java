import java.util.*;
public class OperationInArr {

    public static void Move_to_End(int[] arr) {
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
    public static int[] applyOperations(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) {
                arr[i] = arr[i] * 2;
                arr[i+1] = 0;
            }
        }

        Move_to_End(arr);



        return arr;
    }

    public static void print(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array is : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the Element of array is : ");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int res[] = applyOperations(arr);
            print(res);
        }
    }
}
