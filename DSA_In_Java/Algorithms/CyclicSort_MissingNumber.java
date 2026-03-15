import java.util.ArrayList;
import java.util.List;

public class CyclicSort_MissingNumber {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // For range 1 to N, the correct index is value - 1
            int correct = nums[i] - 1;

            // Check if value is in correct spot AND handle duplicates
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            // If the number at this index isn't index + 1, it's missing!
            if (nums[index] != index + 1) {
                result.add(index + 1);
            }
        }
        return result;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1};
        List list = findDisappearedNumbers(arr);
        System.out.println(list);
    }
}
