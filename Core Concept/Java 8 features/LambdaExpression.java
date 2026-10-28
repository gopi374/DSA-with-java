//A lambda expression in Java is a short way to write an implementation of a functional interface
// syntax :- (params)->{body}
// -> lambda operator

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
//A functional interface is an interface that contains exactly one abstract method.
interface addition{
    int add(int a,int b);
}


public class LambdaExpression {
    static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello Java");
        r.run();
        //lf with interface
        addition ans=(a,b)->a+b;
        System.out.println(ans.add(4,5));

        //lf with collection
        List<String> names = Arrays.asList("Amit", "Rahul", "Priya");

        names.forEach(name -> System.out.println(name));

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
