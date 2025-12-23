/*Q7. Problem :
 In a sorted array, use binary search to find the position where a given key should be inserted to maintain order.
Example: Input:arr = {1, 3, 5, 6}, key = 2
         Output: Insert Position = 1
Logic Explanation: Use binary search to find mid.
If key < arr[mid], move high to mid - 1.
If key > arr[mid], move low to mid + 1.
When loop ends, low will be the correct insert position.
 */
public class InsertBinary 
{
    public static int position(int[] arr, int key)
    {
        int left = 0, right = arr.length-1;
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if(arr[mid] > key)
            {
                right = mid-1;
            }else
            {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int key = 2;
        System.out.println(position(arr, key));
    }
}
