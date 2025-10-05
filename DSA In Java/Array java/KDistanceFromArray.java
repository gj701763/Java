 //  |i - j| <= k and nums[j] == key.
import java.util.*;
public class KDistanceFromArray 
{
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) 
    {
        int n = nums.length;
        boolean[] marked = new boolean[n];  
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) 
        {
            if (nums[i] == key) 
            {
                int start = Math.max(0, i - k);
                int end = Math.min(n - 1, i + k);
                for (int j = start; j <= end; j++) 
                {
                    marked[j] = true;
                }
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            if (marked[i]) result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,9,1,3,9,5};
        int key = 9, k = 1;
        System.out.println(findKDistantIndices(arr,key,k));
    }
}
