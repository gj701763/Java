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
    public static void main(String[] args) {
        int cost[] = {10,20,2,4,7};
        System.out.println(minCost(cost));

    }
}
