package lesson8.exercise;
import  java.util.function.*;

public class MyFI {
    public static void main(String[] args) {
        Function<Double, Double> m = x -> 1.6 * x;
        m.apply(2.0);

        Function<Double, Boolean> m1 = x->x%2==0;
        System.out.println(m1.apply(2.4));

    }
}
