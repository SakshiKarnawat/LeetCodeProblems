package LinkedList; /**
 * Main Idea 1: In the first solution I maintain a size variable and use a temp node as the first node. The size is
 * the size of the list from head to tail. We subtract n from this list and start the current iteration from temp.
 * Until the size is greater than zero, we keep decrementing the size in each iteration. And reach to the element
 * previous to element we wish to delete and point it's next pointer to element after the one we want to delete.
 *
 * Time Complexity: O(N)
 *
 * Main Idea 2: In the solution I maintain a SIZE variable and head as the first node. The size is the size of
 * the list from head to tail. I subtract n from this list and start the current iteration from head.
 * Until the size - 1 is greater than zero, I keep decrementing the size in each iteration. And reach to the element
 * previous to element I wish to delete and point it's next pointer to element after the one I want to delete.
 * If the size of the list is not greater than n then i just check if head is not null and point it to next.
 *
 * Time Complexity: O(N)
 *
 * Main Idea 3: In this solution I make use of an arrayList. Element from the list are iterated and added to the
 * arrayList. Once this is done I check if the size of the arraylist is greater than if yes then, i just set the
 * current node to list.get(list.size - n -1). This leads to element just before the one to delete then I point it's
 * next pointer to element after the one we want to delete. If the size of the list is not greater than n then i
 * just check if head is not null and point it to next.
 *
 * Time Complexity: O(N)
 *
 */

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNode {
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
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode temp = new ListNode(0);
         temp.next = head;
         ListNode curr = head;
         int size = 0;
         while(curr != null){
             size++;
             curr = curr.next;
         }

         size -= n;
         curr = temp;
         while(size > 0){
             size--;
             curr = curr.next;
         }
         curr.next = curr.next.next;

         return temp.next;

    }
    public ListNode removeNthFromEnd2(ListNode head, int n) {

         ListNode curr = head;
         int size = 0;
         while(curr != null){
             size++;
             curr = curr.next;
         }

         if(size > n){
             size -= n;
             curr = head;
             while(size - 1  > 0){
                 size--;
                 curr = curr.next;
             }
             curr.next = curr.next.next;
         }
         else{
             if(head != null){
                 head = head.next;
             }
         }
         return head;

    }
    public ListNode removeNthFromEnd3(ListNode head, int n) {

        ListNode curr = head;
        List<ListNode> l = new ArrayList<>();

        while(curr != null){
            l.add(curr);
            curr = curr.next;
        }

        if(l.size() > n){
            curr = l.get(l.size() - n - 1);

            if(curr.next != null){
                curr.next = curr.next.next;
            }
        }
        else{
            if(head != null){
                head = head.next;
            }
        }
        return head;
    }

}
