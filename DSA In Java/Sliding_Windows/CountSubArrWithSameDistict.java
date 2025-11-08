
/*
* Count Complete Subarrays in an Array
You are given an array arr consisting of positive integers.
The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array.
Return the number of complete subarrays.
Input: arr = [1,3,1,2,2]
Output: 4
Explanation: The complete subarrays are the following: [1,3,1,2], [1,3,1,2,2], [3,1,2] and [3,1,2,2].
* */

import java.util.*;

public class CountSubArrWithSameDistict 
{
    public static int countSub(int[] arr) 
    {
        int n = arr.length;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : arr) 
        {
            set.add(num);
        }
        int k = set.size();
        int i = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) 
        {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            while (map.size() == k) 
            {
                count += (n - j);
                int left = arr[i];
                map.put(left, map.get(left) - 1);
                if (map.get(left) == 0) 
                {
                    map.remove(left);
                }
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the array elements is : ");
            for (int i = 0; i < n; i++) 
            {
                arr[i] = sc.nextInt();
            }

            System.out.println(countSub(arr));
        }
    }
}
