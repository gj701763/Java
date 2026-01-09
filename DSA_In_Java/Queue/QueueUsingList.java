public class QueueUsingList {
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;


        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            int front = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(3);
        q.add(13);

        q.add(23);

        q.add(33);

        q.add(43);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

