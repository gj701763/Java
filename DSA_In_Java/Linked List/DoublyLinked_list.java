public class DoublyLinked_list {

    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
        }

        
    }

    static void display1(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
static void display2(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(9);
        Node c = new Node(3);
        Node d = new Node(8);
        Node e = new Node(1);
        Node f = new Node(2);
        Node g = new Node(6);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = g;
        g.prev = f;
        g.next = null;

        display2(g);
        display1(a);

    }


   
}
