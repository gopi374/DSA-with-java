package Collection.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("apple",5);
        linkedHashMap.put("guava",5);
        linkedHashMap.put("graphs",5);
        for(Map.Entry<String,Integer> entry :linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
