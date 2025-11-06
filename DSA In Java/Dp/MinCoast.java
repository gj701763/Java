import java.util.Arrays;

public class MinCoast {

    private static int min(int cost[], int i, int dp[]) {
        if(i >= cost.length) return 0;
        if(dp[i] != -1) return dp[i];
        return dp[i] = cost[i] + Math.min(min(cost, i+1, dp), min(cost, i+2, dp));
    }

    public static int minCost(int cost[]) {
        int dp[] = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(min(cost, 0, dp), min(cost, 1, dp));
    }

    public static int minCostTB(int cost2[]) {
        int n = cost2.length;
        int dp[] = new int[n];
        dp[0] = cost2[0];
        dp[1] = cost2[1];
        for(int i = 2; i < n; i++) {
            dp[i] = cost2[i] + Math.min(dp[i-1], dp[i-2]);
        }

        return Math.min(dp[n-2], dp[n-1]);

    }
    public static void main(String[] args) {
        //int cost[] = {10,20,2,4,7};
        int cost[] = {1,100,1,1,1,100,1,1,100,1};
        int cost2[] = {1,100,1,1,1,100,1,1,100,1};
        System.out.println("----"+ " Memoization Method"+"-------");
        System.out.println(minCost(cost));
        System.out.println("----"+ " Tabulation Method"+"-------");
        System.out.println(minCost(cost2));

    }
}
