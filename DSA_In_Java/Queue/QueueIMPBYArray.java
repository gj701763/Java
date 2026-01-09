//package DSA In Java.Queue;

public class QueueIMPBYArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full !!!");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmty()) {
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;
            return front;
        }

        public static int peek() {
            if (isEmty()) {
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(3);
        q.add(13);

        q.add(23);

        q.add(33);

        q.add(43);

        while (!q.isEmty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
