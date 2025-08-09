import java.util.*;
public class TwoSum {

    public static int[] twoSum(int arr[], int k) {
        int ans[] = {-1};
        for(int i = 0; i < arr.length; i++) {
            int sum = k - arr[i];
            for(int j = i + 1; j < arr.length - i; j++) {
                if(sum == arr[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return ans;
    }
    public static int[] twoSumH(int arr[], int target) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int diff = target - arr[i];
            if(map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }
            map.put(arr[i], i);
        }

        return null;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3,2,5,7};
        int k = 5;
        //int res[] = twoSum(arr, k);
        System.out.println(Arrays.toString(twoSum(arr, k)));
    }
}
