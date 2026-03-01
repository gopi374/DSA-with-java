import java.util.Vector;

public class ImportantVectorMethods {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        // 1️⃣ add(E e) → Add element at end
        v.add(10);
        v.add(20);
        v.add(30);

        // 2️⃣ add(int index, E element) → Insert at position
        v.add(1, 15);   // [10, 15, 20, 30]

        // 3️⃣ get(int index) → Access element
        System.out.println("Element at index 2: " + v.get(2));

        // 4️⃣ set(int index, E element) → Update element
        v.set(2, 25);   // [10, 15, 25, 30]

        // 5️⃣ remove(int index) → Remove by index
        v.remove(3);    // removes 30

        // 6️⃣ remove(Object o) → Remove by value
        v.remove(Integer.valueOf(15));  // removes 15

        // 7️⃣ size() → Number of elements
        System.out.println("Size: " + v.size());

        // 8️⃣ contains(Object o) → Check value
        System.out.println("Contains 25? " + v.contains(25));

        // 9️⃣ isEmpty() → Check if empty
        System.out.println("Is Empty? " + v.isEmpty());

        // 🔟 clear() → Remove all elements
        v.clear();
        System.out.println("After clear: " + v);

        // 1️⃣1️⃣ clone() → Shallow copy
        Vector<Integer> v2 = (Vector<Integer>) v.clone();
        System.out.println("Cloned Vector: " + v2);
    }
}