public class CircularQueue {
    static class Queue {
        static int arr[];
        static int rear = -1;
        static int size;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full!!!");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmty()) {
                return -1;
            }

            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        public static int peek() {
            if (isEmty()) {
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue a = new Queue(8);
        a.add(8);
        a.add(7);
        a.add(6);
        a.add(5);
       // a.add(4);

        System.out.println(a.remove());
        a.add(3);
        System.out.println(a.remove());
        a.add(2);
        while (!a.isEmty()) {
            System.out.println(a.peek());
            a.remove();
        }
    }
}
