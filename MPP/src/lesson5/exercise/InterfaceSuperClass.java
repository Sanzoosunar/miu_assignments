package lesson5.exercise;

import java.util.Arrays;
import java.util.Calendar;

abstract class mySupperClass{
    public void printName(){
        System.out.println("Super Class!");
    }
}
interface myInterface3{
    public default void printName(){
        System.out.println("myInterface3 Class!");
    }
}
interface myInterface2 extends myInterface3{
    public default void printName(){
        System.out.println("myInterface2 Class!");
    }
}
interface myInterface extends myInterface3{
    public default void printName(){
        System.out.println("myInterface Class!");
    }
}
public class InterfaceSuperClass implements myInterface{
   
    public static void main(String[] args) {
      InterfaceSuperClass m = new InterfaceSuperClass();
      m.printName();
      

    }
}