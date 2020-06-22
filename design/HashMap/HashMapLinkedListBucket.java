package design.HashMap;

import java.util.ArrayList;
import java.util.List;

public class HashMapLinkedListBucket {

    private int keyRange;
    private List<HashMapBucket> hash_table;
    public HashMapLinkedListBucket(){
        this.keyRange = 2069;
        this.hash_table = new ArrayList<HashMapBucket>();
        for(int i = 0; i < keyRange; i++){
            this.hash_table.add(new HashMapBucket());
        }
    }

    public int _hash(int key){
        return (key % this.keyRange);
    }

    public void put(int key, int value){
        int hash_key = _hash(key);
        this.hash_table.get(hash_key).update(key, value);
    }

    public int get(int key){
        int hash_key = _hash(key);
        return this.hash_table.get(hash_key).get(key);
    }

    public void remove(int key){
        int hash_key = _hash(key);
        this.hash_table.get(hash_key).remove(key);
    }

}
