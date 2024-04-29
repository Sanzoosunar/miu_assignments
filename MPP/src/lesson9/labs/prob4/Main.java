package lesson9.labs.prob4;

import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {

        IntStream.iterate(1, i->(int)Math.pow(Math.sqrt(i) + 1, 2))
                .limit(4)
                .forEach(System.out::println);
    }
}
