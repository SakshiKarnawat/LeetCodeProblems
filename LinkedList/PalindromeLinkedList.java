/**
 *
 * Main Idea: The main idea is to use fast and slow pointer to reach the center of the list. After this taking slow
 * as the head I reverse the list from the slow node. Then I assign the fast node to be head again. And while slow
 * node is not null i check if at any point value at slow not equal to value at fast. If True then I return false.
 * I keep incrementing the slow and the fast pointer. And outside the loop I return true.
 *
 * Time Complexity: O(2N)
 *
 */
package LinkedList;

public class PalindromeLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;
        slow = reverseList(slow);
        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;

        }
        return true;
    }

    public ListNode reverseList(ListNode head){
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

}
