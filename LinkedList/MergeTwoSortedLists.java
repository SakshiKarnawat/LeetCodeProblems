/**
 * Main Idea 1: The idea for the iterative approach is that use a temporary head start from that. Check the minimum
 * value between the two list, add that to next of the temp head and so on. If the lists unequal check if l1 is null
 * then prev.next = l2 else = l1. Finally return the temphead.next as the answer.
 *
 * Time Complexity: O(M+N)
 *
 * Main Idea 2: The idea for recursive approach is that , if either of l1 or l2 is initially null, there is no merge to
 * perform, so we simply return the non-null list. Otherwise, we determine which of l1 and l2 has a smaller head,
 * and recursively set the next value for that head to the next merge result.
 *
 * Time Complexity: O(M+N)
 *
 *
 */
package LinkedList;

public class MergeTwoSortedLists {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeTwoListsIterative(ListNode l1, ListNode l2) {

        ListNode temphead = new ListNode(-1);
        ListNode prev = temphead;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;

        return temphead.next;
    }

    public ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        else if(l2 == null) return l1;

        else if(l1.val < l2.val){
            l1.next = mergeTwoListsRecursive(l1.next, l2);
            return l1;

        }else{
            l2.next = mergeTwoListsRecursive(l1, l2.next);
            return l2;
        }

    }
}
