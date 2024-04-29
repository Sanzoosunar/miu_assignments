package lesson9.exercise;

import java.util.function.Function;

public class Lambda {
    Function<String, Integer> f = s -> Integer.parseInt(s);

    int offset = 100;
    Function<String, Integer> f1 = s -> Integer.parseInt(s) + offset;

    public static void doLambda(){
        int offset = 23;
        Function<String, Integer> f1 = s -> Integer.parseInt(s) + offset;
    }

    public static void main(String[] args) {
        int offsetf2 = 100;
        Function<String, Integer> f2 = s -> Integer.parseInt(s) + offsetf2;
    }
}