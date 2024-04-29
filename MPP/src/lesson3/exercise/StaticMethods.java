package lesson3.exercise;


class SuperClass{
    public static int getNum(){ return 4; }
}
public class StaticMethods extends SuperClass{

    public static int getNum(){ return 2;
    }

    public void printName(){
        System.out.println("PrintName");
        this.getNum();
        super.getNum();
    }
    public static void main(String[] args) {


        StaticMethods staticMethods = new StaticMethods();
        System.out.println(staticMethods.getNum());

        SuperClass superClass = new SuperClass();
        //System.out.println(superClass.getNum());

    }
}
