package lesson7.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

enum CommandWord {

    GO("go"), LOOK("look"), TAKE("take"),
    HELP("help"), QUIT("quit");
    private String commandString;

    CommandWord(String commandString)
    {
        this.commandString = commandString;
    }

    public String toString ()
    {
        return commandString;
    }
}
enum myEnum{
    TITLE("Hadush"),
    PRICE(2000);
    int price;
    String name;
    myEnum(String name){
        this.name = name;
    }

    myEnum(int price){
        this.price = price;
    }

    String getName(){
        return name;
    }

    int getPrice(){
        return price;
    }
}

class superClass{
    protected static String myName = "hadush";
    protected static void myMethod(){
        System.out.println("my super class static method");
    }
}

interface superInterface{
    abstract void mymethod1();

    private void myMethod2(){
        System.out.println("My method");
    }

    static void myMethod3(){
        System.out.println("My method");
    }
}
public class MyInterfaces extends superClass{

    public static void main(String[] args) {
        System.out.println(myName);
        myEnum me = myEnum.PRICE;
        System.out.println(me.getName());

        Iterator<String> iterable = Arrays.asList("MIU", "MIT").iterator();

    }
}
