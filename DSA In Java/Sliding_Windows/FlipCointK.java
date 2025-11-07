
/*
7. Maximum Number of Consecutive Ones
Example:
Input1: arr = [1, 1, 0, 1, 1, 1]

Input2: arr = [1,1,1,0,0,0,1,1,1,1,0], k = 2  ou = 6
Output: 3 (subarray [1,1,1])
#Array #Binary Search #Sliding Window #Prefix Sum
*/
import java.util.*;

public class FlipCointK {
    public static int maxConsecutiveOnes(int[] arr, int k) {
        int left = 0; 
        int max_length = 0; 
        int zero_count = 0; 
        for (int right = 0; right < arr.length; right++) 
        {
            if (arr[right] == 0) {
                zero_count++;
            }
            while (zero_count > k) 
            {
                if (arr[left] == 0) 
                {
                    zero_count--; 
                }
                left++; 
            }
            max_length = Math.max(max_length, right - left + 1);
        }

        return max_length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the k Of flip is : ");
        int k = sc.nextInt();

        System.out.print(maxConsecutiveOnes(arr,k));
    }
}
