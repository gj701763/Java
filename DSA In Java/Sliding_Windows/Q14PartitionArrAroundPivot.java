import java.util.*;

public class Q14PartitionArrAroundPivot 
{
    private static void partitionArray(int[] arr, int pivot) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) 
        {
            if (arr[left] < pivot) 
            {
                left++;
            } else if (arr[right] >= pivot) 
            {
                right--;
            } else 
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.print("Enter the array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the pivot: ");
            int pivot = sc.nextInt();

            partitionArray(arr, pivot);

            System.out.print("Partitioned array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

    
}
