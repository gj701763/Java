//package DSA In Java.Sortting Java;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    
    public static void printArray(int arr[])
    {
        for(int num : arr)
        {
            System.out.print(num+ " ");
        }
        System.out.println();
    }

    // public static void quickSort(int arr[], int low, int high)
    // {
    //     if(low < high)
    //     {
    //         int pi = partition(arr, low, high);
    //         quickSort(arr, low, pi-1);
    //         quickSort(arr, pi+1, high);
    //     }
    // }
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = randomizedPartition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int randomizedPartition(int[] arr, int low, int high) {
       
        Random rand = new Random();
        int pivotIndex = rand.nextInt(high - low + 1) + low;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = temp;
        return partition(arr, low, high);
    }

    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low -1;
        for(int j = low; j < high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.print("Enter the " + n + " size of array is : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Sorted array is : ");
            quickSort(arr, 0, n-1);
            printArray(arr);
        }
    }
}








