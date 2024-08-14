import java.util.*;
public class Merge_Sort {

    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void conquer(int arr[], int start, int mid, int end) {
        int merge[] = new int[end - start + 1];

        int index1 = end;
        int index2 = mid+1;
        int x = 0;

        while(index1 <= mid && index2 <= end) {
            if(arr[index1] <= arr[index2]) {
                merge[x++] = arr[index1];
            }else {
                merge[x++] = arr[index2];
            }
        }

        while(index1 <= mid) {
            merge[x++] = arr[index1];
        }

        while(index2 <= end) {
            merge[x++] = arr[index2];
        }

        for(int i = 0, j = start; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
       
    }

    static void divide(int arr[], int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquer(arr, start, mid, end);
       
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array is : ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter the "+n+" size of array is : ");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Sorted array is : ");
            divide(arr, 0, n-1);
            printArray(arr);
        }
    }
}