package lesson4.exercise;

class StaticMethodSuperClass{
    protected static int x;
    int z;

    public static void superStatic(){
        System.out.println("SuperStatic Method!");

    }
}

public class StaticMethodSubClass extends StaticMethodSuperClass{
    int x;

    public void instantMethod(){
        StaticMethodSubClass.super.z = 10;
        StaticMethodSubClass.this.x = 9;
        StaticMethodSubClass.super.x = 10;
        StaticMethodSuperClass.superStatic();
    }

    public static void superStatic(){
        System.out.println("SubStatic Method!");
    }

    public static void main(String[] args) {
        StaticMethodSuperClass s = new StaticMethodSubClass();
        s.superStatic();

    }
}
