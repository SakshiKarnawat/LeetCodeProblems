package LinkedList;

public class RotateList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) return head;
        ListNode curr = head;
        int size = 1;
        while(curr.next != null){
            curr = curr.next;
            size++;

        }

        curr.next = head;
        curr = head;
        int i = 0;
        while (i < size - k % size - 1){
            i++;
            curr = curr.next;
        }

        ListNode new_head =  curr.next;
        curr.next = null;

        return new_head;


    }
}
