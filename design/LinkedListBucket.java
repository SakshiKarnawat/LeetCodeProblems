package design;

import java.util.LinkedList;

class LinkedListBucket {

    private LinkedList<Integer> container;
    public LinkedListBucket(){
        container = new LinkedList<Integer>();
    }
    public void insert(Integer key){

        int index = this.container.indexOf(key);
        if(index == -1)
            this.container.addFirst(key);
    }
    public void removekey(Integer key){

        this.container.remove(key);
    }

    public boolean exists(Integer key){
        int index = this.container.indexOf(key);
        return (index != -1 );
    }
}
