//Methods Reference
// A method reference is a shorthand notation for a lambda expression that calls an existing method.

import java.util.Arrays;
import java.util.List;

public class MethodRef {

    //types of method refence - static ref
    static void show() {
        System.out.println("Java 8");
    }

    public static void main(String[] args) {

        //with lambda exp.
        List<String> names1 = Arrays.asList("Amit", "Rahul", "Priya");
        names1.forEach(name -> System.out.println(name));

        //with method ref.
        List<String> names = Arrays.asList("Amit", "Rahul", "Priya");
        names.forEach(System.out::println);

        Runnable r=MethodRef::show; // MethodRef::show refers to the existing static method show().
        r.run();
    }
}
