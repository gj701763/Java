import java.util.*;
public class Sorting_in_binaryArraysmartapproach {

    
    static void swapArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortbinaryArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            if(arr[i] == 1 && arr[j] == 0) {
                swapArray(arr,i,j);
                i++;
                j--;
            }
            if(arr[i] == 0) {
                i++;
            }
            if(arr[j] == 1) {
                j--;
            }
        }
    }

    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
            sortbinaryArray(arr);
            printArray(arr);
        }
        
      


    }
}
