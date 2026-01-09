//package DSA In Java.Sortting Java;

import java.util.Arrays;

public class AllSortingAlgo {
    
    public static void print(int[] arr) {
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        print(arr);
    }

    public static void selectionSort(int[] arr) { // j
        int n = arr.length; // i j
        for (int i = 0; i < n - 1; i++)// 8 5 3 9 4 1 2 3
        {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
        print(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        print(arr);
    }

    public static void main(String[] args) {

        int[] arr = { 5, 3, 9 };
        print(arr);

        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);

    }
}

