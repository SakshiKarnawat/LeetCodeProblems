package LinkedList; /**
 *
 * Main Idea 1: Create a hash set. Check if the node already exists, if yes then return that node.
 *
 * Time Complexity: O(N)
 *
 * Main Idea 2: Uses two pointer first to find the cycle and the intersection at which they meet each other.
 * Then you pass this to the function and iterate one pointer from head and other from the intersection found
 * before. The point where they meet is the point where the cycle starts.
 *
 * Time Complexity: O(N)
 *
 */

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleII {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> s = new HashSet<>();
        while (head != null) {
            if (!s.contains(head)) {
                s.add(head);
            } else {
                return head;
            }
            head = head.next;
        }

        return null;
    }


    // Method 2: Use an intersection function


    public ListNode getIntersection(ListNode head) {


        ListNode fast = head;
        ListNode slow = head;


        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {

                return slow;

            }
        }

        return null;
    }


    public ListNode detectCycle2(ListNode head) {

        if(head == null) return null;

        ListNode ptr1 = head, ptr2 = getIntersection(head);

        if(ptr2 == null) return null;

        while(ptr1 != ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
}
