import java.util.*;

public class MaxFrequStack {
    Map<Integer, Integer> map;
    Stack<Integer> st;

    public MaxFrequStack() {
        map = new HashMap<>();
        st = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        map.put(val, map.getOrDefault(val, 0) + 1);
    }

    public int pop() {
        int max = Integer.MIN_VALUE;
        while (!st.isEmpty()) {
            int top = st.pop();
            if (max < map.get(top)) {
                max = top;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 5, 7, 4, 5 };
        MaxFrequStack m = new MaxFrequStack();
        for (int i = 0; i < arr.length; i++) {
            m.push(arr[i]);
        }
        System.out.println(m.pop());
    }
}
