//Java 8 provides reusable functional interfaces in the java.util.function package.
//
//These interfaces are especially useful when working with lambda expressions and the Stream API.

//Example 1: Predicate
//A Predicate<T> accepts a value and returns true or false.
//Example 2: Function
//A Function<T, R> accepts a value and returns a result.
//Example 3: Consumer
//A Consumer<T> accepts a value and performs an operation without returning a result.
//Example 4: Supplier
//A Supplier<T> supplies a value without accepting an argument.

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredifendFunctional_interface {
    public static void main(String[] args) {
        Predicate<Integer> p = n -> n > 10;

        System.out.println(p.test(15));
        System.out.println(p.test(5));

        Function<Integer, Integer> square = n -> n * n;

        System.out.println(square.apply(5));

        Consumer<String> c = s -> System.out.println(s);

        c.accept("Hello Java 8");

        Supplier<String> s = () -> "Welcome to Java 8";

        System.out.println(s.get());
    }
}

