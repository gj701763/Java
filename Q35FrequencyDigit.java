
/*
 * Q4. Write a java program to find the frequency of each digit in a given integer using function 
name as countDigit(). 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 */

public class Q35FrequencyDigit 
{
    public static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,0,2,1,2,0,0,2,1,2,0};
        int low = 0, mid = 0, high = arr.length-1;

        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                swap(arr, mid, low);
                low++;
                mid++;
            }else if(arr[mid] == 1)
            {
                mid++;
            }else
            {
                swap(arr, high, mid);
                high--;
            }
        }
        for(int num : arr)
            System.out.print(num+ " ");
        
    }
}
