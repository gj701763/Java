import java.util.*;
/*
 * Given an integer array arr, return the mean of the remaining integers after 
 * removing the smallest 5% and the largest 5% of the elements.
 * Answers within 10-5 of the actual answer will be considered accepted.
 */
public class RemovingCount {

    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println(n);
        int removingCount = (int)Math.floor(n * 0.05);
        //int removingCount = (int) Math.floor(n * (percent / 100.0));

        System.out.println(removingCount);
        int sum = 0;
        for(int i = removingCount; i < n - removingCount; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        int remainingCount = n - 2 * removingCount;
        System.out.println(remainingCount);
        double ans = (double) sum / remainingCount;
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0};
        double res = trimMean(arr);
        System.out.println(res);
    }
    
}
