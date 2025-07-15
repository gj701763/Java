public class ReverseList {
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        
        while(curr != null) {
            Node nest = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nest;      
        }
        return prev;
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
        print(head);
        head= reverseList(head);
        print(head);
    }
}
