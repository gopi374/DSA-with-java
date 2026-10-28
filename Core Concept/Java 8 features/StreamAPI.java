//The Stream API is a Java 8 feature used to process collections of data in a functional style.
//
//It allows developers to filter, transform, sort, and calculate results from data without writing lengthy loops.

//Types

//filter()	Selects elements that satisfy a condition.
//map()	Transforms each element.
//sorted()	Sorts elements.
//distinct()	Removes duplicate elements from the stream.
//forEach()	Performs an action on each element.
//collect()	Collects stream results into a collection or another result container.
//reduce()	Combines elements to produce a single result.
//count()	Counts the elements.
//limit()	Limits the number of elements processed.


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(1,6, 2, 2,3, 4, 5, 6, 7, 8);

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even number :" + evenNumbers);

        numbers.stream()
                .filter(n -> n % 2 == 0).distinct().limit(3).sorted()
                .forEach(System.out::println);

        //Explanation
        //The program performs three operations:
        //1. stream() creates a stream from the list.
        //2. filter() selects numbers that are divisible by two.
        //3. forEach() prints each selected number.


    }
}
