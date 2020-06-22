/**
 * Main Idea: To take a dummy node before head. Keep checking id curr.next is null, if not then check if the value
 * of the curr.next node matches the value to delete. if yes then point the curr's next pointer to element after the next
 * element else cur = cur.next. You finally return head.next as head is currently the dummy node.
 *
 * Time Complexity: O(N)
 *
 */
package LinkedList;

public class RemoveElements {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode curr = new ListNode(-1);
        curr.next = head;
        head = curr;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head.next;

    }
}
