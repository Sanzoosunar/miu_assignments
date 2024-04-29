package lesson7.exercise;

interface A{
   abstract void print();
   static void printStatic(){
       System.out.println("Print Static A");
   }
}

interface B{
    default void print(){
        System.out.println("Interface B print");
    }
}

interface C extends A, B{
     void print();
}

abstract class D implements A, B{
    public abstract void print();
}

class E{
    public void print(){
        System.out.println("Super class E");
    }

    static void printStatic(){
        System.out.println("Print Static E");
    }
        }
public class MultipleInterface extends E implements A{
   public void print() {
       System.out.println("Sub class print");
   }

    static void printStatic(){
        System.out.println("Print Static Multiple");
    }

    public static void main(String[] args) {
        A a = new MultipleInterface();
        a.print();
        A.printStatic();
        E.printStatic();
       // a.printStatic();

        E e = new MultipleInterface();
        e.printStatic();
    }
}
