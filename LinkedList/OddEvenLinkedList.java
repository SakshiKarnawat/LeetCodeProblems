/**
 * Main Idea: First the first node is set ass odd and second as even. The element after the even is the next odd
 * and the element after the next odd is the next even. This way we get an odd and even list. I also use a temp head
 * to store the start of even number. After the last odd node i attach this even head to the last odd next pointer.
 *
 * Time Complexity: O(N)
 *
 *
 */
package LinkedList;

public class OddEvenLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode oddEvenList(ListNode head) {

        if(head == null) return null;

        ListNode odd = head, even = head.next;
        ListNode tempHead = even;

        if(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = tempHead;

        return head;
    }
}

