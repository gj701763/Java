
import java.util.*;

public class SubsetArr {

    public static void printSubSet(int[] arr, List<Integer> ans, int i) {
        if(i == arr.length) {
            // Base case: print current subset
            System.out.println(ans);
            return;
        }

        // Include current element
        ans.add(arr[i]);
        printSubSet(arr, ans, i + 1);

        // Backtrack and exclude current element
        ans.remove(ans.size() - 1);
        printSubSet(arr, ans, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        List<Integer> current = new ArrayList<>();
        printSubSet(arr, current, 0);
        
        double sub = Math.pow(2, arr.length);
        System.out.println("Total subsets: " + (int)sub);
    }
}
