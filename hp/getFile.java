package hp;

//import java.util.*;
public class getFile {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Linkedlist {
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

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Linkedlist l = new Linkedlist();
        l.insertAtEnd(8);
        l.insertAtEnd(9);
        System.out.print("null");
        l.display();
    }

}
