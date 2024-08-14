
public class InsertAt_Position {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtIndex(int index, int data) {
            Node t = new Node(data);
            Node temp = head;
            // if(index == size()) {
            // insertAtEnd(data);
            // return;
            // }
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

        }

        void insertAtHead(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void deleteAtIndex(int index) {
            if (index == 0) {
                head = head.next;
                return;
            }
            Node temp = head;
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp = tail;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int getIndex(int index) {
            Node temp = head;
            if (index < 0 || index > size()) {
                System.out.println("Wrong index !!!");
                return -1;
            }
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        int size() {
            int count = 0;
            while (head != null) {
                count++;
                head = head.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAtEnd(8);
        l.insertAtEnd(5);
        l.insertAtEnd(3);
        l.insertAtEnd(9);
        l.insertAtEnd(11);
        l.insertAtHead(90);
        l.insertAtHead(98);
        // l.display();
        // System.out.println("Size of Linked list is : "+l.size());
        l.insertAtIndex(3, 50);
        l.display();
        // System.out.println(l.tail.data);
        // System.out.println(l.getIndex(9));
        // l.deleteAtIndex(0);
        // l.display();

    }
}
