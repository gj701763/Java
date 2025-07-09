///package DSA In Java.Stack;

public class StackImp {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack{
        public static Node head;
        public boolean isEmty() {
            return head == null;
        }

        public void push(int data) {
            Node temp = new Node(data);
            if(isEmty()) {
                head = temp;
                return;
            }
            temp.next = head;
            head = temp;
        }

        public int pop() {
            if(isEmty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;

        }

        public int peek() {
            if(isEmty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(8);
        s.push(81);
        s.push(82);
        s.push(83);

        while(!s.isEmty()){ 
            System.out.println(s.peek());
            s.pop();
        }

    }
}
