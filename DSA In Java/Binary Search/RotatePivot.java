/* Question 2:
Given a sorted array rotated at some pivot (like [6, 7, 1, 2, 3, 4, 5]), search for a number x using binary search.
Example:
 arr = [6, 7, 1, 2, 3, 4, 5], x = 3
 Output: Found at index 4
Explanation:In rotated arrays, one half (left or right) is always sorted.
Check which half is sorted:
If arr[left] <= arr[mid], left part is sorted.
Else, right part is sorted.
Decide which half to discard based on x.
 */
public class RotatePivot 
{
    public static int search(int[] arr, int x) 
    {
        int left = 0, right = arr.length - 1;
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)return mid;
            if (arr[left] <= arr[mid]) 
            {
                if (x >= arr[left] && x < arr[mid]) 
                {
                    right = mid - 1;

                } else 
                {
                    left = mid + 1;
                }
            }
            else 
            {
                if (x > arr[mid] && x <= arr[right]) 
                {
                    left = mid + 1;
                    
                } else 
                {
                    right = mid - 1;
                }
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 1, 2, 3, 4, 5 };
        int x = 3;

        int index = search(arr, x);
        System.out.println("Found at index: " + index);
    }
}
