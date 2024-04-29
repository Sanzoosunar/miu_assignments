package lesson9.labs.prob1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Bill", "Thomas", "Mary");

        /*
         * Write one line of code necessary to print this stream to the
         * console so that the output looks like this:
         * Bill, Thomas, Mary
         */
        String s = stringList.stream()
                .collect(Collectors.joining(", "));
        System.out.println(s);

    }
}
