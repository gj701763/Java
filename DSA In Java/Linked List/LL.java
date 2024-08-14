public class LL {         //   Linked List
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {        // Add First 
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {       // Add Last  
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void printList() {               // print Linklist 
        if(head == null) {
            System.out.println("List is Empty");
        }
        Node curNode = head;
        while(curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst() {                 //  Delete At  First
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {                  // Delete At Last
        if(head == null) {
            System.out.println("List if emply"); 
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node secNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secNode = secNode.next;
        }
        secNode.next = null;
    }
    public int getsize() {
        return size;
    }
    
    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.print(list.getsize());
    }
} 