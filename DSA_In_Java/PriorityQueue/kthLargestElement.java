import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargestElement {
    public static int kthlargestElen(int arr[], int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : arr) {
            p.add(n);
            if (p.size() > k) {
                p.poll();
            }
        }
        return p.peek();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 6, 1, 15, 7, 8, 3, 6 };
        int k = 4;
        System.out.println(kthlargestElen(arr, k));
    }
}
