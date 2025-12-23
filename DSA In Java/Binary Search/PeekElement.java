/*Q4. A peak element is greater than or equal to its neighbors. Given an array, find the index of any one peak element using binary search. exmple: Input: arr = [1,3,20,4,1,0] → Output: 2 (20 is a peak).
Explanation: Check middle element. If arr[mid] is greater than neighbors → peak found. Otherwise, move towards the side that has a greater neighbor.
 */
public class PeekElement 
{
    public static int peekElement(int[] arr)
    {
        int left = 0, right = arr.length-1;
        while (left < right) 
        {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) 
            {
                left = mid + 1;
            }
            else 
            {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,3,20,4,1,0};
        System.out.println(peekElement(arr));
    }
    
}
