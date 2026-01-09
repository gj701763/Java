import java.util.Scanner;

public class RotateArr {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node rotateArr(Node head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int n = 1;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            n++;
        }
        temp.next = head;
        System.out.println(n);

        k = k % n;
        int stepsToNewHead = n - k;
        System.out.println(k);
        System.out.println(stepsToNewHead);

        Node newTail = temp;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rotation of list is : ");
        int k = sc.nextInt();
        head = rotateArr(head, k);
        print(head);
        sc.close(); 

    }
}
