package Collection.WeakHashMap;

import java.util.Map;
import java.util.WeakHashMap;
import java.util.HashMap;

public class Weakhashmapdemo {
    static void main(String[] args) {
        WeakHashMap<String, String> map = new WeakHashMap<>();

        // Add entries
        map.put("Java", "Language1");
        map.put("Python", "Language2");
        map.put("C++", "Language3");

        System.out.println("WeakHashMap elements: " + map);

        // Access an element
        System.out.println("Value for 'Python': " + map.get("Python"));

        // Remove an element
        map.remove("C++");
        System.out.println("After removing 'C++': " + map);

        // Iterate elements correctly using Map.Entry
        System.out.println("Iterating WeakHashMap:");
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
