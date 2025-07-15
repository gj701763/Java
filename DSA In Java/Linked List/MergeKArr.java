/*
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
   Merge all the linked-lists into one sorted linked-list and return it.
   Example 1:
   Input: lists = [[1,4,5],[1,3,4],[2,6]]
   Output: [1,1,2,3,4,4,5,6]
   Explanation: The linked-lists are:
   [
     1->4->5,
     1->3->4,
     2->6
   ]
   merging them into one sorted linked list:
   1->1->2->3->4->4->5->6
 */

public class MergeKArr {

    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public static ListNode buildList(int[] nums) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next; // Return the head of the actual list
    }

    public static void main(String[] args) {
        ListNode[] arr = new ListNode[] {
                buildList(new int[] { 1, 4, 5 }),
                buildList(new int[] { 1, 3, 4 }),
                buildList(new int[] { 2, 6 })
        };

        // Print each list to verify
        for (ListNode head : lists) {
        while (head != null) {
            tail.next = new ListNode(head.val);  // copy node
            tail = tail.next;
            head = head.next;
        }
    }

    return dummy.next;
    }
}
