public class MaxSumWithLengthDiviByK {

    public static long maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        long sum = 0;
        long maxSum = Long.MIN_VALUE;

        long[] minPrefix = new long[k];

        for (int i = 0; i < k; i++) {
            minPrefix[i] = Long.MAX_VALUE;
        }

        minPrefix[0] = 0;

        for (int i = 1; i <= n; i++) {
            sum += arr[i - 1];
            int rem = i % k;

            if (minPrefix[rem] != Long.MAX_VALUE) {
                maxSum = Math.max(maxSum, sum - minPrefix[rem]);
            }

            // Update minimum prefix sum for this remainder
            minPrefix[rem] = Math.min(minPrefix[rem], sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = { -1, -2, -3, -4, -5 };
        System.out.println(maxSubarraySum(arr1, 4)); // -10

        int[] arr2 = { -5, 1, 2, -3, 4 };
        System.out.println(maxSubarraySum(arr2, 2)); // 4
    }
}
