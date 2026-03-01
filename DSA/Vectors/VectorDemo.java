import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class VectorDemo {
    public static void main(String[] args) {

        // 1️⃣ Creating a Vector
        Vector<String> v = new Vector<>(3, 2); // initial capacity 3, increment 2

        // 2️⃣ Adding elements
        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");

        // addElement (legacy method)
        v.addElement("Mango");

        // 3️⃣ Inserting at specific index
        v.add(1, "Orange");

        System.out.println("Vector elements: " + v);

        // 4️⃣ Accessing elements
        System.out.println("Element at index 2: " + v.get(2));
        System.out.println("First Element: " + v.firstElement());
        System.out.println("Last Element: " + v.lastElement());

        // 5️⃣ Updating element
        v.set(2, "Pineapple");
        System.out.println("After update: " + v);

        // 6️⃣ Checking size and capacity
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());

        // 7️⃣ Searching
        System.out.println("Contains Mango? " + v.contains("Mango"));
        System.out.println("Index of Mango: " + v.indexOf("Mango"));

        // 8️⃣ Iterating using for loop
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        // 9️⃣ Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 🔟 Using Enumeration
        System.out.println("\nUsing Enumeration:");
        Enumeration<String> en = v.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

        // 1️⃣1️⃣ Removing elements
        v.remove("Banana");
        v.remove(0); // remove by index
        System.out.println("After removal: " + v);

        // 1️⃣2️⃣ Cloning
        Vector<String> v2 = (Vector<String>) v.clone();
        System.out.println("Cloned Vector: " + v2);

        // 1️⃣3️⃣ Checking empty
        System.out.println("Is Empty? " + v.isEmpty());

        // 1️⃣4️⃣ Clearing all elements
        v.clear();
        System.out.println("After clear: " + v);
        System.out.println("Is Empty Now? " + v.isEmpty());
    }
}