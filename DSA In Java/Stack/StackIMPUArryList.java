import java.util.*;
public class StackIMPUArryList {
    public static class Stacks{
        List<Integer> l = new ArrayList<>();
        public boolean isEmpty() {
            return l.size() == 0;
        }
        public void push(int data) {
            l.add(data);
        }

        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = l.get(l.size()-1);
            l.remove(l.size()-1);
            return top;
        }
        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return l.get(l.size()-1);
        }
    }

    public static void pushAtBottom(int data, Stack<Integer> s) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        s.push(top);
    }
    public static void main(String[] args) {
        //Stack s = new Stack(); Implementation using ArrayList  
        Stack<Integer> s = new Stack<>(); // Implementation using Stack Inbulid Function
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // pushAtBottom(6, s);
        // s.push(5);
        reverse(s);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
