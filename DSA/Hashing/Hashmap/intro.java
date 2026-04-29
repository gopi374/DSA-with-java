import java.util.*;

public class intro {
    public static void main(String[] args) {
        //hashmap is a data structure which is used to store unique value in the form of key pair.
        //it stores only unique keys and the value is may duplicate or unique.

        //string = key, integer =value
        //country(key),population(value)
        HashMap<String ,Integer> map = new HashMap<>();

        //insertion
        map.put("india",140);
        map.put("russia", 150);
        map.put("USA",120);


        //traversal
        System.out.println(map);

        //search
        //use conatainsKey() method
        if(map.containsKey("hello")){
            System.out.println("key present in map");
        }
        else{
            System.out.println("key is not present in map");
        }

    }
}