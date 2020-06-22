package design.HashMap;

import java.util.LinkedList;
import java.util.List;

public class HashMapBucket {
    private List<HashMapPair<Integer, Integer>> bucket;
    public HashMapBucket(){
        this.bucket = new LinkedList<HashMapPair<Integer, Integer>>();
    }

    public int get(Integer key){
        for(HashMapPair<Integer, Integer> pair : this.bucket){
            if(pair.first.equals(key))
                return pair.second;
        }

        return -1;
    }

    public void update(Integer key, Integer value){
        boolean seen = false;
        for(HashMapPair<Integer, Integer> pair : this.bucket){
            if(pair.first.equals(key)){
                pair.second = value;
                seen = true;
            }
        }

        if(!seen){
            this.bucket.add(new HashMapPair<>(key,value));
        }
    }

    public void remove(Integer key){
        for(HashMapPair<Integer, Integer> pair : this.bucket){
            if(pair.first.equals(key)){
                this.bucket.remove(pair);
            }
        }
    }
}
