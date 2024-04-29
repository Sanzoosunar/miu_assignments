package lesson9.labs.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class MyLambdaLib {
    public static final QuadFunction<List<Employee>, Integer, Character, String, String> FilterEmployee =
            (emps, salary, name, joiner)-> emps.stream()
                    .filter(a->a.getSalary()>salary)
                    .filter(a->a.lastName.toUpperCase().charAt(0)>name)
                    .map(a->a.getFirstName()+" "+a.getLastName())
                    .sorted()
                    .collect(Collectors.joining(joiner));
}
