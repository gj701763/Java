import java.util.*;

public class Sorted_Arrayin_squareroot {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swapArray(int ans[], int i, int j) {
        int temp = ans[i];
        ans[i] = ans[j];
        ans[j] = temp;
    }

    static void reverseArray(int ans[]) {
        int i = 0;
        int j = ans.length - 1;
        while (i < j) {
            swapArray(ans, i, j);
            i++;
            j--;
        }
    }

    static int[] squareArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        int ans[] = new int[arr.length];
        int k = 0;
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k++] = arr[i] * arr[i];
                i++;
            } else {
                ans[k++] = arr[j] * arr[j];
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.print("Enter the " + " size of array is : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans[] = squareArray(arr);
            //reverseArray(ans);
            System.out.print("Sorted array is : ");
            printArray(ans);
            // reverseArray(ans);
            // printArray(ans);
        }
    }
}
