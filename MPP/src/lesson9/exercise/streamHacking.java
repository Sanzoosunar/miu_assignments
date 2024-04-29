package lesson9.exercise;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamHacking {
    public static void main(String[] args) {
        System.out.println(Stream.of(1,2,3,4,5)
                .count());

        double[] a = new double[]{2.9, 3, 4, 443, 3, 5, 9, 5, 23, 9};
        DoubleStream stream = DoubleStream.of(a)
                .skip(11)
                .limit(10)
                        .limit(20);

        System.out.println(stream.count());

        Stream.iterate(1, x->x+2)
                .skip(4)
                .limit(4)
                .forEach(System.out::println);

        List<String> list= Arrays.asList("Eleven", "Hitch", "Galaxy", "Moon", "universe");
        String[] s = list.stream()
                .toArray(String[]::new);
        System.out.println(Arrays.toString(s));

        List<Integer> list1 = Arrays.asList(3,5,3,7,2);
        List<int[]> intArrays = list1.stream()
                .map(int[]::new)
                .collect(Collectors.toList());

        List<String> stringList = intArrays.stream()
                .map(Arrays::toString)
                .collect(Collectors.toList());

        System.out.println(intArrays);
        System.out.println(stringList);


        List<List<String>> lists2 = new ArrayList<>(){{
            add(new ArrayList<>(){{
                add("Hadush");
                add("Hailu");
            }});

            add(new ArrayList<>(){{
                add("MIU");
                add("MIT");
            }});

            add(new ArrayList<>(){{
                add("Japan");
                add("USA");
            }});
        }};

        System.out.println(lists2);

        lists2.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }


}
