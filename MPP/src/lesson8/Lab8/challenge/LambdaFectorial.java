package lesson8.Lab8.challenge;

import java.util.Objects;
import java.util.function.Function;

class Person{
    private String name;
    Person(String name){
        this.name = name;
    }

    public boolean equals(Person p) {
        if (this == p) return true;
        return Objects.equals(name, p.name);
    }

}

public class LambdaFectorial {

    static Function<Integer,Integer> l = (x)->x==0?1:x*LambdaFectorial.l.apply(x-1);

    public static void main(String[] args) {
        System.out.println(LambdaFectorial.l.apply(5));


    }
}
