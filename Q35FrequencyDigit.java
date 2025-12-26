
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
        int arr[] = {1,0,1,0,1,1,0,1};
        int j = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int n : arr) System.out.print(n+" ");
    }
}
