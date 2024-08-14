/*  Given an array of integers of size n.
    Answer q queries where you need to print the sum
    of values in a given range of indices from l or r(both include).
    Note : The values of l and r in queries follow 1-based indexing.
 */
import java.util.*;
public class Prefix_Sum {

    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // static int[] prefix_sumArray(int arr[]) {

    //     int n = arr.length;
    //     int[] ans =  new int[n];
    //     ans[0] = arr[0];
    //     for(int i = 1; i < n; i++) {
    //         ans[i] = ans[i-1] + arr[i];
    //     }
    //     return ans;
    // }

    static int[] prefix_sumArrayS(int arr[]) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
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

            //printArray(arr);
           // int[] ans = prefix_sumArray(arr);
           int[] ans = prefix_sumArrayS(arr);
            System.out.println("Sum of prefix array is : ");
            printArray(ans);
            System.out.println("Q number of query is : "); 
            int q = sc.nextInt();
            while(q-- > 0) {
                System.out.println("Enter the range : ");
                int l = sc.nextInt();
                int r = sc.nextInt();

                int sum = ans[r] - ans[l - 1];
                System.out.println("Sum is : "+ sum);
            }
        }
    }
}
