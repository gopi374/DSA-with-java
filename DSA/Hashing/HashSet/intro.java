
import java.util.HashSet;
import java.util.Iterator;

public class intro {
    //HashSet ->
    //it is an unordered set
    //Internal Mechanism: Internally, a HashSet uses a HashMap to store its elements. The elements you add to the HashSet are stored as keys in the underlying map, while a dummy object is used as the value.
    //Uniqueness: It does not allow duplicate values.
    //Nulls: Allows a single null element.
    //Order: Like HashMap, it does not guarantee any iteration order.
    //Performance: Offers O(1)time complexity for add, remove, and contains.

    public static void main(String[] args) {

        HashSet<Integer> set =new HashSet<>();

        //insert
        set.add(6);
        set.add(5);
        set.add(2);
        set.add(1);
        for(int e:set){
            System.out.println(e);
        }

        //search
        if(set.contains(1)){
            System.out.println("contains");
        }

        //delete/remove
       set.remove(1);

       // size
       set.size();

       System.out.println(set);

       Iterator it=set.iterator();
       while(it.hasNext()){
            System.out.println(it.next());
       }
    }
}
