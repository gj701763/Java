// Minimum Average of Smallest and Largest Elements
import java.util.Arrays;

public class MinimumAverage {
    public static void main(String[] args) {
        
        int nums[] = { 7, 8, 3, 4, 15, 13, 4, 1 };

        Arrays.sort(nums);

        int left = 0, right = nums.length-1;
        double minValue = Double.MAX_VALUE;
        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            minValue = Math.min(minValue, avg);
            left++;
            right--;
        }

        System.out.println(minValue);
       
    }
}
