import java.util.*;
public class Merge_Sort {

    public static void printArray(int arr[]) {
        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }
        for(int j = 0; j < n2; j++) {
            right[j] = arr[mid+1+j];
        }

        int i = 0; 
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

    }

    public static void mergeSort(int arr[], int l, int r){
        if(l >= r) return;
        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
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
            mergeSort(arr, 0, n-1);
            printArray(arr);
        }
    }
}