//A. Collectors
//The Collectors utility class provides methods for collecting stream results into lists, sets, maps, strings, and other result structures.

//B. Parallel Streams
//Parallel streams allow stream operations to process elements using multiple threads when appropriate.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsandParallelStreams {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("Amit", "Rahul", "Priya");

        List<String> result = names.stream()
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(result);
        //filter() selects names starting with "A", and Collectors.toList() collects them into a new list.

        //B
        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5);

        numbers.parallelStream()
                .forEach(System.out::println);

        //Parallel streams can be useful for suitable CPU-intensive workloads, but they are not always faster than sequential streams.

    }
}
