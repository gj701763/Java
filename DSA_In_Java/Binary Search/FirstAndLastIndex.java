/*
 * Question 1:
Given a sorted array (may contain duplicates), find the first and last index of a given number x using binary search.
Example:
arr = [2, 4, 4, 4, 6, 7, 9], x = 4
Output: First = 1, Last = 3
Explanation :
Modify binary search:


To find first occurrence, if arr[mid] == x, move left to check more occurrences.
To find last occurrence, if arr[mid] == x, move right to check more occurrences.


This requires two binary searches.

 */

public class FirstAndLastIndex {
    public static int firstInd(int[] arr, int x) {
        int n = arr.length, left = 0, right = n - 1, idx = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                idx = mid;
                right = mid - 1;
            } else if (arr[mid] > x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return idx;
    }
    public static int lastInd(int[] arr, int x)
    {
        int n = arr.length, left = 0, right = n - 1, idx = -1;
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) 
            {
                idx = mid;
                left = mid + 1;
            } else if (arr[mid] > x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 4, 4, 6, 7, 9};
        int x = 4;
        System.out.println(firstInd(arr, x));
        System.out.println(lastInd(arr, x));
    }
}
