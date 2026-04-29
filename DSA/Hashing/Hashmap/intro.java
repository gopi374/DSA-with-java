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


        //print
        System.out.println(map);

        //search
        //use conatainsKey() method
        if(map.containsKey("hello")){
            System.out.println("key present in map");
        }
        else{
            System.out.println("key is not present in map");
        }

        //search -2
        System.out.println(map.get("india")); //if key exist , return the value
        System.out.println(map.get("indo")); //key does not exist


        //iteration 
        //using like for each loop
        //.entrySet() provides the set version of map
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}