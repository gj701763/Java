import java.util.*;
public class StackUsingQueue {
    static class Stack{
        static Queue<Integer> a = new LinkedList<>();
        static Queue<Integer> b = new LinkedList<>();

        public static boolean isEmpty() {
            return a.isEmpty();
        }

        public static void add(int data) {
            while (!a.isEmpty()) {
                b.add(a.remove());
            }

            a.add(data);
            while (!b.isEmpty()) {
                a.add(b.remove());
            }
        }

        public static int remove() {
            return a.remove();
        }

        public static int peek() {
            return a.peek();
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
    }
}
