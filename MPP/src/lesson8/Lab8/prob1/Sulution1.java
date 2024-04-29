package lesson8.Lab8.prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Sulution1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        changeDouble(numbers , val-> System.out.print(2*val + " ")
                /* , Functional Interface implementation*/ );// Output: 2 4 6 8 10

        List<String> data = Arrays.asList("apple", "banana", "cherry");
        //Task 2: Take input of String and transform into Upper case
        transformStrings(data , str->str.toUpperCase()
                /*, Functional Interface implementation*/);

        // Task 3: Check the inputs of given value is divisible by 5.
        List<Integer> inputs = Arrays.asList(10, 21, 12, 25, 33);
        printIf(inputs,
                x-> x%5==0
                /*, Functional Interface implementation*/);
    }

    public static void changeDouble(List<Integer> numbers, Consumer<Integer> action /*,Functional Interface action */) {
        for (Integer number : numbers) {
            action.accept(number);
        }
    }
    public static void transformStrings(List<String> list,
            Function<String,String> transformer
            /*,Functional Interface transformer */) {
        for (String s : list) {
              System.out.println(transformer.apply(s));
        }
    }
    public static void printIf(List<Integer> numbers,
                               IntPredicate condition
            /*, transformer condition*/) {
        for (Integer number : numbers) {
            if (condition.test(number)) {
                System.out.println(number);
            }
        }
    }
}
