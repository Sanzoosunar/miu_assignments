package lesson8.Lab8.prob4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "Kristy"};
        /*
         * a. Use Arrays.sort() to sort the names by ignore case using Method reference
         * //Arrays.sort(names,(s1,s2)->s1.compareToIgnoreCase(s2));
         */

        Arrays.sort(names,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

        /*
         *  b. Convert the sorted names array into List.
         * //Arrays.sort(names,(s1,s2)->s1.compareToIgnoreCase(s2));
         */
        List<String> stringList = Stream.of(names)
                .collect(Collectors.toList());

        /*
         *  c. Print the sorted list using method reference.
         * //Arrays.sort(names,(s1,s2)->s1.compareToIgnoreCase(s2));
         */
        Stream.of(names)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
