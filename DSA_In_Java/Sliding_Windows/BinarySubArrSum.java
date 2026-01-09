import java.util.*;
public class BinarySubArrSum 
{
    public static int countSubArr(int[] arr, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, sum = 0;
        map.put(0,1);
        for(int num : arr)
        {
            sum += num;
            if(map.containsKey(sum-k))
            {
                count += map.get(sum-k);
            }
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the size of array is : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the element of array is : ");
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the target sum is : ");
            int k = sc.nextInt();

            System.out.print("Total sub array is : "+ countSubArr(arr, k));
        }
        
    }
}
