package Collection.hashmap;

import java.util.*;

public class Treemap {

    // To show TreeMap constructor
    static void Constructor(){

        // Creating an empty TreeMap
        TreeMap<Integer, String> tm = new TreeMap<>();

        // Mapping string values to int keys using put()
        // method
        tm.put(10, "Geeks");
        tm.put(15, "For");
        tm.put(20, "Geeks");

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tm);
    }

    public static void main(String[] args){

        System.out.println(
                "TreeMap using TreeMap() constructor");

        // Calling constructor
//        Constructor();


        //NAVIGABLEMAP
        NavigableMap<Integer,String> navigableMap= new TreeMap<>();
        navigableMap.put(15,"fifteen");
        navigableMap.put(10,"ten");
        navigableMap.put(6,"six");
        navigableMap.put(5,"five");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(10));
        System.out.println(navigableMap.descendingMap());
        System.out.println(navigableMap.lastEntry());

    }
}