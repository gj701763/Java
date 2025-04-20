
public class Interview_Que {

    public static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data= data;
        }
    }

    public static Node nthNode(Node head, int n) {

        int count = 0;
        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        int m = count -n +1;
        temp = head;
        for(int i = 1; i < m-1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static class Linked {
        Node head = null;
        Node tail = null;
        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if(head == null) {
                head = temp;
                tail = temp;
            }else {
                tail.next = temp;
                tail = temp;
            }
        }

        int find_end_of_the_list(int n) {
            Node slow = head;
            Node fast = head;
            for(int i = 0; i < n; i++) {
                fast = fast.next;
            }
            while(fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow.data;
        }

        Node delete_Node_endof_list(int n)  {
            Node slow = head;
            Node fast = head;
            for(int i = 0; i < n; i++) {
                fast = fast.next;
            }
            if(fast == null) {
                head = head.next;
                return head;
            }
            while(fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return head;
        }

        int middle_Element() {
            Node slow = head;
            Node fast = head;
           
            while(fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow.data;
        }

        void insertAtHead(int data) {
            Node temp = new Node(data);
            if(head == null) {
                head = temp;
                tail = temp;
            }else {
                temp.next = head;
                head = temp;
            }
        }
         
        void insertAtIndex(int index, int data) {
            Node t = new Node(data);
            Node temp = head;
            for(int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        int nthnNode(Node head,int n) {
            int count = 0;
            Node temp = head;
            while(temp != null) {
                count++;
                temp = temp.next;
            }
            int m = count - n + 1;
            for(int i = 1; i < m -1; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

       

        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

       
    }

    
    public static void main(String[] args) {
        Linked l = new Linked();
        l.insertAtEnd(8);
        l.insertAtEnd(38);
        l.insertAtEnd(82);
        l.insertAtEnd(85);
        l.insertAtEnd(18);
        l.insertAtEnd(89);
        l.insertAtHead(1);
        l.display();
       // System.out.println(l.find_end_of_the_list(2));
       // l.delete_Node_endof_list(7);
       // l.display();
       // l.delete_Node_endof_list(4);
       // l.middle_Element();
       // System.out.println(l.middle_Element());
        


    }
}
