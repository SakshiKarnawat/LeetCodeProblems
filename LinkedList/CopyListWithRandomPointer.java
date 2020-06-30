/**
 * Main Idea Solution 1: The first solution consist of a simple HashMap. First I iterate the list using
 * next pointer and in the map store that node and a clone of the node. Next you go back to head. Set the clone
 * list's random pointer same as original list's random pointer but to a clone node. Thus you create a clone
 * list from the original list.
 *
 * Time Complexity: O(2N)
 *
 * Main Idea Solution 2: In the recursive solution, I recursively add the nodes and their clones to the map.
 * Then recursively move to their connections like in a graph.
 *
 * Time Complexity: O(N)
 */
package LinkedList;

import java.util.HashMap;
import java.util.Map;


public class CopyListWithRandomPointer {

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }


    public Node CopyListWithRandomPointer(Node head){
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            map.get(curr).random = map.get(curr.random);
            map.get(curr).next = map.get(curr.next);
            curr = curr.next;
        }

        return map.get(head);
    }

    HashMap<Node, Node> visited = new HashMap<Node,Node>();
    public Node CopyListWithRandomPointerRecursive(Node head){

        if(head == null) return null;
        if(this.visited.containsKey(head)) return this.visited.get(head);

        Node node = new Node(head.val);
        this.visited.put(head, node);

        node.random = CopyListWithRandomPointerRecursive(head.random);
        node.next = CopyListWithRandomPointerRecursive(head.next);


        return node;
    }
}
