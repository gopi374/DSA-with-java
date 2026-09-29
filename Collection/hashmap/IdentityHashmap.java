package Collection.hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashmap {
    static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        String str1 = new String("key");
        String str2 = new String("key");
        //HASHMAP will replace the value it compare the keys using .equals()
        map1.put(str1,1);
        map1.put(str2,2);
        System.out.println(map1);

        //IDENTITYHASHMAP compare using ==
        map.put(str1,1);
        map.put(str2,2);
        System.out.println(map);
    }
}
