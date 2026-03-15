import java.util.HashMap;
import java.util.PriorityQueue;

public class FindKFrequentElements {

    public static int[] findkfreEle(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
        for (int key : map.keySet()) {
            maxHeap.add(key);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[] top = new int[k];
        for (int i = k - 1; i >= 0; --i) {
            top[i] = maxHeap.poll();
        }
        return top;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        int ans[] = findkfreEle(arr, k);
        for (int n : ans)
            System.out.print(n + " ");
    }
}
