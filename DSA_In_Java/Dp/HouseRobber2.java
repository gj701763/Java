import java.util.Arrays;

public class HouseRobber2 {

    private static int maxLoot(int arr[], int dp[], int start, int end) {
        if(start > end) return 0;

        if(dp[start] != -1) return dp[start];
        int steal = arr[start] + maxLoot(arr, dp, start+2, end);
        int skip = maxLoot(arr, dp, start+1, end);
        return dp[start] = Math.max(steal, skip);
    }

    public static int house(int nums[]) {
        int n = nums.length;
        if(n == 1) return nums[0];
        
        // Case 1: Exclude last
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = maxLoot(nums, dp1, 0, n-2);

        // Case 2: Exclude first
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = maxLoot(nums, dp2, 1, n-1);
        
        return Math.max(case1, case2);
    }

    public static int rob(int[] nums) { // HouseRobber I
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int dp[] = new int[n+1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], nums[i]+dp[i-2]);
        }

        return dp[n-1];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println("----"+ " Memoization Method"+"-------");
        System.out.println(house(arr));
        System.out.println("----"+ " Tabulation Method"+"-------");
        System.out.println(rob(arr));
    }
}
