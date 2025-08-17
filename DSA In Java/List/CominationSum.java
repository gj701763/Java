import java.util.ArrayList;
import java.util.List;

public class CominationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> current,
            List<List<Integer>> result) {
        if (target == 0) { // Found valid combination
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0)
            return; // Exceeded sum, stop this path

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]); // choose
            backtrack(candidates, target - candidates[i], i, current, result); // stay at i (unlimited picks)
            current.remove(current.size() - 1); 
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 7 };
        int target = 7;
        List res = combinationSum(arr, target);
        System.out.println(res);
    }
}
