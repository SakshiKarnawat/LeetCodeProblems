package LinkedList;

public class TwoPointerTemplate {

    /**
     * Definition for singly-linked list.
     **/

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * Change this condition to fit specific problem.
     * Attention: remember to avoid null-pointer error
     **/

    public boolean template(ListNode head) {
        // Initialize slow & fast pointers
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;           // move slow pointer one step each time
            fast = fast.next.next;      // move fast pointer two steps each time
            if (slow == fast) {         // change this condition to fit specific problem
                return true;
            }
        }
        return false;   // change return value to fit specific problem
    }
}
