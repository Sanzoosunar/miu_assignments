package lesson2_exercise;

class Parent{
    private String name = myName();

    {
        System.out.println("Parent instance block");
        System.out.println(name); //--illegal forward reference compile error
    }


    String myName(){
        System.out.println("Hadush");
        return "Hadush";
    }

}

class Child extends Parent{
    static{
        System.out.println("Child static block");
        //System.out.println("val: " + val);
    }
    static int val = 8;
}
public class OrderOfExecution {
    public static void main(String[] args) {
        new Child();
    }
}
