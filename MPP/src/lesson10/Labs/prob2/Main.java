package lesson10.Labs.prob2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static <T extends Comparable<? super T>> T secondSmallestItem(List<T> list) {

        for( int j=1; j < list.size(); j++) {
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).compareTo(list.get(i - 1)) < 0) {
                    T tmp = list.get(i);
                    list.set(i, list.get(i - 1));
                    list.set(i - 1, tmp);
                }
            }
        }
        T secondSmallestItem = list.get(1);
        return secondSmallestItem;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(19,3,1,3,4,23,78);
        System.out.println(secondSmallestItem(integers));

        List<String> strings = Arrays.asList("banana", "apple", "orange", "grape");
        System.out.println(secondSmallestItem(strings));
    }
}