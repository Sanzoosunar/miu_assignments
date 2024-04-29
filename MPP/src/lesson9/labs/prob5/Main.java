package lesson9.labs.prob5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static Stream<String> streamSection(Stream<String> stream,
                                               int m,
                                               int n) {
        return stream.skip(m-1).limit(n-m+1);
    }

    private static Stream<String> nextStream() {
        return Stream.of("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
                "iii");
    }

    public static void main(String[] args) {

        System.out.println("Position 3 to 5");
        streamSection(nextStream(), 3,5).forEach(System.out::println);
        System.out.println("Position 1 to 7");
        streamSection(nextStream(), 1,7).forEach(System.out::println);
        System.out.println("Position 8 to 9");
        streamSection(nextStream(), 8,9).forEach(System.out::println);

    }
}
