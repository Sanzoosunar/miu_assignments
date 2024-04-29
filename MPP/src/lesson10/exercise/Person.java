package lesson10.exercise;

public class Person<T> {
    private String name;

    Person(){
        this.name = "MyFakeName";
    }

    Person(String name){
        System.out.println(new Person<T>().getName());
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        System.out.println(new Person<String>("Luwam").getName());
    }
}
