/*         Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
           Search for the number 7 & display its index.
 */

public class LLProblem {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data) {
        Node temp = new Node(data);
        if(head == null) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    public void addLast(int data) {
        Node temp = new Node(data);
        if(head == null) {
            head = temp;
            return;
        }
        Node t = head;
        while(t.next != null) {
            t = t.next;
        }
        t.next = temp;
    }

    public void printlist() {
        if(head == null) {
            System.out.println("List is Empty");
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void reversIterate() {
        if(head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node curNode = head.next;
        while(curNode != null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode;
            // Update
            prevNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String args[]) {
        LLProblem list = new LLProblem();
        list.addFirst(1);
        //list.printlist();
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        list.printlist();
        list.reversIterate();
        list.printlist();
    }
}