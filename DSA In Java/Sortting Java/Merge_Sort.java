import java.util.*;
public class Merge_Sort {

    public static void printArray(int arr[]) {
        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void merge(int a[], int b[], int arr[]) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                arr[k++] = a[i++];
            else
                arr[k++] = b[j++];
        }

        while (i < a.length)
            arr[k++] = a[i++];
        while (j < b.length)
            arr[k++] = b[j++];
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return;
        int a[] = new int[n / 2];
        int b[] = new int[n - n / 2];
        int idx = 0;
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];
        mergeSort(a);
        mergeSort(b);
        merge(a, b, arr);
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
            System.out.print("Sorted array is : ");
            mergeSort(arr);
            printArray(arr);
            System.out.println(1 % 3);
        }
    }
}