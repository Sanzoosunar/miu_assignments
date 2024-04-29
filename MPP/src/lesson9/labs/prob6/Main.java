package lesson9.labs.prob6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static Set<String> union(List<Set<String>> sets) {
        return sets.stream()
                .reduce(new HashSet<>(), (prev, next) -> {
                    prev.addAll(next);
                    return prev;
                });
    }

    public static void main(String[] args) {
        List<Set<String>> sets = List.of(Set.of("A", "B"),
                Set.of("D"),
                Set.of("1", "3", "5"));

        Set<String> unionSet = union(sets);
        System.out.println(unionSet);
    }

}
