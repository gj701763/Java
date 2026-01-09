import java.util.Stack;

public class NextGreaterEle {

    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }
            s.push(arr[i]);
        }

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}