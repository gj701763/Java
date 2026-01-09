public class MinimalSubArr {

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;
    
        for (int right = 0; right < n; right++) {
            sum += nums[right];  // expand window

            // shrink while condition is satisfied
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0: minLen;
        
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, arr));
    }
}
