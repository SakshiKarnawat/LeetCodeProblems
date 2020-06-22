package LinkedList; /**
 * Main idea: The first solution uses a hash set. You add the node into the set and iterate through the list. As you
 * encounter the node again there is a cycle.
 *
 * Time Complexity: O(N)
 *
 * Main Idea 2: The idea is to use two pointer. One moves by one and the other by two. If the two are equal at any point
 * then that means that there is a cycle.
 *
 * Time Complexity: O(N)
 *
 *
 */

import java.util.HashSet;
import java.util.Set;



public class CycleLinkedList {
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

    public class Solution {
        public boolean hasCycle1(ListNode head) {

            Set<ListNode> s = new HashSet<>();

            while(head!=null){
                if(!s.contains(head)){
                    s.add(head);
                }else {
                    return true;
                }
                head = head.next;
            }
            return false;
        }

        public boolean hasCycle2(ListNode head) {

            if(head == null || head.next == null)
                return false;

            ListNode slow = head;
            ListNode fast = head.next;

            while(slow != fast){

                if(fast == null || fast.next == null)
                    return false;

                slow = slow.next;
                fast = fast.next.next;

            }
            return true;
        }
    }
}
