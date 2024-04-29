package lesson7.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterface {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        List<String> list = Arrays.asList("MIU", "MIT", "Stanford");
        list.forEach(System.out::println);
    }
}
