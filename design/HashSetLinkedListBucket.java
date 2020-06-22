package design;


public class HashSetLinkedListBucket {

    private LinkedListBucket [] bucketArray;
    private int keyRange;

    public HashSetLinkedListBucket(){
        this.keyRange = 769;
        bucketArray = new LinkedListBucket[this.keyRange];
        for(int i = 0; i < this.keyRange; i++){
            this.bucketArray[i] = new LinkedListBucket();
        }
    }

    protected int _hash(int key){
        return (key % this.keyRange);
    }

    public void add(int key){

        int bucketIndex = this._hash(key);
        this.bucketArray[bucketIndex].insert(key);

    }

    public void delete(int key){

        int bucketIndex = this._hash(key);
        this.bucketArray[bucketIndex].removekey(key);

    }

    public boolean containsElement(int key){

        int bucketIndex = this._hash(key);
        return this.bucketArray[bucketIndex].exists(key);
    }

    public void printHashSet(){
        for(int i = 0; i < bucketArray.length; i++){
            System.out.println(bucketArray[i]);
        }
    }
    public static void main(String[] args) {

        HashSetLinkedListBucket hs = new HashSetLinkedListBucket();
        hs.add(20);
        hs.add(50);
        hs.add(210);
        hs.add(530);
        hs.printHashSet();
        System.out.println(hs.containsElement(2));
        hs.delete(0);
        hs.printHashSet();
    }

}
