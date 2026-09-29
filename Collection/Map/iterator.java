package Collection.hashmap;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {

        // Create an ArrayList and add some elements
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(4);

        // Obtain an iterator for the ArrayList
        Iterator<Integer> it = al.iterator();

        // Iterate through the elements and print each one
        while (it.hasNext()) {
            int n = it.next();
            if(n%2==0){
                it.remove();
            }
            System.out.println(n);
        }
        it.forEachRemaining(n -> System.out.println(n));
        System.out.println(al);
    }
}