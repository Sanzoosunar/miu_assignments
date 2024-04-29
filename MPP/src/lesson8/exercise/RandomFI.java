package lesson8.exercise;

import java.util.Random;

@FunctionalInterface
interface myRandom<T>{
    T get(T t);
}
public class RandomFI{
    static public Random random = new Random();
    public static void main(String[] args) {
       RandomFI randomFI = new RandomFI();
       myRandom<Integer> myRandom = x->random.nextInt();
        System.out.println(myRandom.get(2).intValue());
    }
}
