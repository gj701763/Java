public class DistanceMark {
    public static long findTheArrayConcVal(int[] nums) {
        int left = 0, right = nums.length - 1;
        int sum = 0;
        if (nums.length % 2 != 0) {
            int mid = (left + right) / 2;
            sum += nums[mid];
        }
        while (left < right) {

            String concatenatedString = String.valueOf(nums[left]) + String.valueOf(nums[right]);
            sum += Integer.parseInt(concatenatedString);
            left++;
            right--;
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 14, 13, 8, 12 };
        System.out.println(findTheArrayConcVal(arr));
    }
}
