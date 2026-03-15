package Questions;

import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] arr, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        int ans[] = new int[k];
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, -1, 2, -1, 2, 3 };
        int k = 2;
        int ans[] = topKFrequent(arr, k);
        for (int num : ans)
            System.err.print(num + " ");
        System.out.println();
    }
}
