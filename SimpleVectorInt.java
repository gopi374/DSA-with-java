import java.util.Vector;

public class SimpleVectorInt {
    public static void main(String[] args) {

        // Create Vector of Integers
        Vector<Integer> numbers = new Vector<>(5);

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Display elements
        System.out.println("Vector: " + numbers);

        // Access element
        System.out.println("Element at index 2: " + numbers.get(2));

        // Update element
        numbers.set(1, 25);
        System.out.println("After update: " + numbers);

        // Remove element
        numbers.remove(3);
        System.out.println("After removal: " + numbers);

        // Size of vector
        System.out.println("Size: " + numbers.size());

        // Check if contains value
        System.out.println("Contains 25? " + numbers.contains(25));

        // Loop through vector
        System.out.println("Using loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println("\nvectors "+numbers);
    }
}