//package DSA In Java.Array java;
import java.util.*;
public class Target_sum {

    static int pairofsum(int arr[], int target) {
        int ans = 0; 
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of Array is : ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.print("Enter the "+n+" size of Array is : ");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the target of sum is : ");
            int target = sc.nextInt();

            System.out.println(pairofsum(arr, target));
        }
    }
}
