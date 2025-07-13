public class MergeSortList {

    // Definition for singly-linked list.
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Function to sort the linked list
    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) return head;

        // Step 1: Split the list into two halves
        Node mid = getMiddle(head);
        Node nextOfMid = mid.next;
        mid.next = null;  // Break the list

        // Step 2: Sort both halves
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMid);

        // Step 3: Merge sorted halves
        return merge(left, right);
    }

    // Merge two sorted linked lists
    private static Node merge(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    // Function to find middle of the linked list
    private static Node getMiddle(Node head) {
        if (head == null) return head;
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Utility function to print list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main to test
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(3);
        head.next.next = new Node(8);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(6);

        System.out.print("Original list: ");
        printList(head);

        head = mergeSort(head);

        System.out.print("Sorted list: ");
        printList(head);
    }
}
