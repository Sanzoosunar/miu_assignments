package lesson9.labs.prob2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        /*
         * Declare list and stream
         */
        List<Integer> integerList = Arrays.asList(4,6,7,8,9,34,-4);
        Stream<Integer> myIntStream = integerList.stream();

        /*
         * Get Max and Min using IntSummaryStatistics
         */
        IntSummaryStatistics summary = myIntStream
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.printf("Max is %s%n", summary.getMax());
        System.out.printf("Min is %s%n", summary.getMin());

    }
}
