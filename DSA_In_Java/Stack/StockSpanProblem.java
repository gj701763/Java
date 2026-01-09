import java.util.Stack;

class Node {
    int data;
    int idx;

    Node(int data, int idx) {
        this.data = data;
        this.idx = idx;
    }
}

public class StockSpanProblem {
    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 85 }; // 1 1 1 2 1 4 6
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty())
                ans[i] = i + 1;
            else if (!st.isEmpty()) {
                ans[i] = i - st.peek();
            }

            st.push(i);
        }
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
