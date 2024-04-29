package lesson9.exercise;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

         List<Integer> li = Stream.iterate(1, i->i+1)
                .limit(100)
                .toList();

         li.parallelStream()
                 .map(x-> Integer.toString(x).concat(" Hadush"))
                 .limit(10)
                 .forEach(System.out::println);



    }
}
