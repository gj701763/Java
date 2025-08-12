import java.util.*;

public class GroupAdd {

    public static List<List<Integer>> groupThePeople(int[] arr) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int size = arr[i];
            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);

            if (map.get(size).size() == size) {
                ans.add(new ArrayList<>(map.get(size)));
                map.get(size).clear(); // reset for next group
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 3, 3, 3, 3, 1, 3 };
        System.out.println(groupThePeople(arr));
    }
}
