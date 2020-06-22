/**
 * Main idea 1: In the iterative solution I take a node prev and curr. The prev is set to null and the curr is set to
 * the head. I iterate the list until curr is not null, in this loop I take a new temp node to store curr.next then set
 * this curr.next to prev, set prev to curr, and finally set curr to temp node. And move forward this way. Finally
 * I return the head node.
 *
 * Time Complexity: O(N)
 *
 * Main Idea 2: In the recursive solution I just keep updating the current node by calling the function recursively
 * and the head.next.next to head and head.next to null;
 *
 * Time Complexity: O(N)
 *
 * Mian Idea 3: I use a stack to store the values of the list in the order they appear and then pop in back because
 * of which i reverse the order.
 *
 * Time Complexity: O(N)
 *
 *
 */
package LinkedList;

import java.util.Stack;

public class ReverseLinkedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode reverseListIterative(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public ListNode reverseListRecursive(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode curr = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return curr;

    }

    public ListNode reverseList(ListNode head) {

        Stack<Integer> s = new Stack<>();
        ListNode curr = head;
        while(curr != null){
            s.add(curr.val);
            curr = curr.next;
        }

        ListNode temp = head;
        while(!s.isEmpty()){

            head.val = s.pop();
            head = head.next;
        }

        return temp;
    }
}
