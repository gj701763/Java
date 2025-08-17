import java.util.Arrays;

public class StickerThief {

    private static int maxLoot(int arr[], int dp[], int idx) {
        if(idx >= arr.length) return 0;
        if(dp[idx] != -1) return dp[idx];
        int steal = arr[idx] + maxLoot(arr, dp, idx+2);
        int skip = maxLoot(arr, dp, idx+1);
        return dp[idx] = Math.max(steal, skip);
    }

    public static int maxSum(int arr[]) {
        int dp[] = new int[arr.length];
        Arrays.fill(dp, -1);

        return maxLoot(arr, dp, 0);
    }
    public static void main(String[] args) {
        int arr[] = {6,5,1,1,7};
        System.out.println(maxSum(arr));
    }
}
