package Collection.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Immutablemap {
    static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        System.out.println(map1);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
//        map2.put("C", 3); throws exception
        Map<String, Integer> map3 = Map.of("Shubham",98); //map.of have an limitation it only took 10 enteries
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("alex",120),Map.entry("alex3",128),Map.entry("alex2",1281)); //map.of have an limitation it only took 10 enteries
        map3.put("Akshit", 88);
    }
}
