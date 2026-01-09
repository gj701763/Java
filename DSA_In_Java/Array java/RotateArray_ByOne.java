import java.util.Scanner;

public class RotateArray_ByOne {

    static void print(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void Rotate(int arr[]) {
        int n = arr.length;

        int temp[] = new int[n];
        temp[0] = arr[n-1];
        for(int i = 0; i<n-1; i++) {
            temp[1+i] = arr[i];
        }

        for(int i= 0; i< n; i++) {
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of Array: ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            System.out.print("Enter the Element of array: ");
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            print(arr);
            System.out.print("Print the Rotate array : ");
            Rotate(arr);
            print(arr);
        }
    }
}
