package Collection.hashmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    static void main(String[] args) {
        SortedMap<Integer,String> mp = new TreeMap<>();
        mp.put(125,"nmkln");
        mp.put(12,"nmln");
        mp.put(116,"nmklm");
        mp.put(18,"nm0");
        System.out.println(mp);
        //it extends map and gives some special methods

        System.out.println(mp.headMap(116));
        System.out.println(mp.tailMap(18));
        System.out.println(mp.firstKey());
        System.out.println(mp.lastKey());
    }
}

