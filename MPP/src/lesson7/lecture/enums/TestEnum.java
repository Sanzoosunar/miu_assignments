package lesson7.lecture.enums;

import java.util.List;

public enum TestEnum{
    COMPANY_NAME;
    //SALES_TARGET;

    public void display(){
        System.out.println("hello world!");
    }
    public void display1(){
        System.out.println("hello display1");
    }
}
class ParentClass{

}
class Test4{
    public static void main(String[] args) {
        //System.out.println(TestEnum.);
        TestEnum.COMPANY_NAME.display();
        TestEnum.COMPANY_NAME.display();
    }
}