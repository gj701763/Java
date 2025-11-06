//package DSA In Java.Sortting Java;
import java.util.Arrays;
public class SelectedMax {

    public static void decresingOrder(int[] arr)
    {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    public static long maximumHappinessSum(int[] happiness, int k) {
        long sum = 0;
        for(int i = 0; i <= k-1; i++)
        {
            sum += (happiness[i] - i);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr= {5,3,9};
        decresingOrder(arr);
        System.out.println(maximumHappinessSum(arr, 2));
    }
}
