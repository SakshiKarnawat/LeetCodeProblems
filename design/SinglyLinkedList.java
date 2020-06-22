package design;


public class SinglyLinkedList {

    int size = 0;
    SinglyNode head = new SinglyNode(0);

    public int getValueAtIndex(int index){
        if(index < 0 || index >= size)
            return -1;

        SinglyNode curr = head;
        for(int i = 0; i < index + 1; i++){
            curr = curr.next;
        }

        return curr.val;
    }

    public void addAtIndex(int index, int value){
        if(index > size)
            return;
        if(index < 0)
            index = 0;

        ++size;

        SinglyNode pred = head;
        SinglyNode curr = new SinglyNode(value);
        for(int i = 0; i < index; ++i){
            pred = pred.next;
        }
        curr.next = pred.next;
        pred.next = curr;

    }

    public void deleteAtIndex(int index){
        if(index >= size || index < 0)
            return;

        size--;
        SinglyNode pred = head;
        for(int i = 0; i < index; i++){
            pred = pred.next;
        }

        pred.next = pred.next.next;

    }

    public void addAtHead(int val){

        addAtIndex(0, val);
    }

    public void addAtTail(int val){

        addAtIndex(size, val);
    }

    public void print(){
        SinglyNode node = head;
        for(int i = 0; i <= size; i++){
            System.out.println(node.val);
            node = node.next;
        }

    }

    public static void main(String[] args) {

        SinglyLinkedList s = new SinglyLinkedList();
        s.addAtHead(1);
        s.addAtIndex(1,2);
        s.addAtTail(3);
        s.print();
        System.out.println("Value at index 1 is: "+s.getValueAtIndex(1));
        s.deleteAtIndex(1);
        System.out.println("Value at index 1 now is: "+s.getValueAtIndex(1));
        s.print();



    }
}
