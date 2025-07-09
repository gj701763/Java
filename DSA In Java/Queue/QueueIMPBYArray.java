//package DSA In Java.Queue;

public class QueueIMPBYArray {
    public static class  Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if(rear == size-1) {
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;

        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is Empty"); 
                return -1;
            }
            return arr[0];
        }
        
    }
    public static void main(String[] args) {
        Queue t = new Queue(5);
        t.add(8);
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        while (!t.isEmpty()) {
            System.out.println(t.peek());
            t.remove();
        }
    }
}
