package Collection.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashset {
    static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(10);
        set.add(9);
        set.add(45);
        set.add(36);

        System.out.println(set);

        //for insertion order
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(9);
        set1.add(45);
        set1.add(4);
        set1.add(36);

        System.out.println(set1);


        // for sorted manner

        Set<Integer> set2 = new TreeSet<>();
        set2.add(10);
        set2.add(9);
        set2.add(45);
        set2.add(4);
        set2.add(36);

        System.out.println(set2);
    }
}
