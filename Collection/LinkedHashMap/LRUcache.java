package Collection.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcache<k,v> extends LinkedHashMap<k,v> {

    private int capacity;

    public LRUcache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<k, v> eldest) {
        return size()>capacity;
    }

    static void main(String[] args) {
        LRUcache<String , Integer> lrUcache = new LRUcache<>(3);
        lrUcache.put("apple",5);
        lrUcache.put("hey",54);
        lrUcache.put("graph",25);
        lrUcache.put("banana",96);
        lrUcache.put("Bob",5);

        System.out.println(lrUcache);

    }
}
