/**
 * Time Complexity: O(m + n)
 *
 */

package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {

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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> s = new HashSet<>();

        while (headA != null) {
            if (!s.contains(headA)) {
                s.add(headA);
            }
            headA = headA.next;
        }
        while (headB != null) {
            if (!s.contains(headB)) {
                s.add(headB);
            } else {
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;

            if (p1 == p2) {
                return p1;
            }

            if (p1 == null) {
                p1 = headB;
            }

            if (p2 == null) {
                p2 = headA;
            }
        }
        return p1;

    }
}
