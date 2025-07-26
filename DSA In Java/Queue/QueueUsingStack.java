import java.util.*;
public class QueueUsingStack {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void push(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int pop() {
            if(isEmpty()) {
                System.out.println("Queue is empty !!!");
                return -1;
            }

            return s1.pop();
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty !!!");
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue a = new Queue();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);

        while (!a.isEmpty()) {
            System.out.println(a.peek());
            a.pop();
        }
    }


}
