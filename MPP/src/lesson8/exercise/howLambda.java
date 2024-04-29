package lesson8.exercise;

import java.util.function.Function;
import java.util.function.Supplier;

class Person{
    private String name;
    Person(String name){
        this.name =  name;
    }

    public String getName(){
        return this.name;
    }

    public static int myStatic(){
        return 8;
    }
}
public class howLambda extends Person{
    int x;

    Function<Person, String> p = Person::getName;
    Supplier<Integer> supplier = ()->getX();
    //Function<Person, Integer> p2 = Person::myStatic();
    Function<String, howLambda> p3 = howLambda::new;

    public void getters(howLambda a) {
        //Supplier<Integer> function = a::getX;
        //Function<Integer, Integer> function1 = a::getX;
        //Function<Integer, Integer> function1 = howLambda::staticInt;
    }

    void setX(int x){
        this.x = x;
    }
    howLambda(String name){
        super(name);
    }

    private static int staticInt(int x){
        return x+3;
    }
    public int getX() {
        return x;
    }
    public int getX(int i) {
        return x;
    }

    public String getName(){
        return super.getName();
    }

    public static void main(String[] args) {
        Person p1 = new Person("hadush");
        Function<Person, String> function = Person::getName;
    }
}
