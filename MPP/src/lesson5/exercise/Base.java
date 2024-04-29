package lesson5.exercise;

class Extension{
    static void print(){
        System.out.println("Extension printed");
    }

}

public class Base extends Extension {
    public static void main(String[] args) {
        Extension e = new Base();
        e.print();

    }

    static void print(){
        System.out.println("base printed");
    }

}
