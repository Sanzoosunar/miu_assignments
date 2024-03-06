package assignment3.problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter C for Circle\n" +
                "Enter R for Rectangle\n" +
                "Enter T for Triangle");

        String shapeType=sc.nextLine();
        switch (shapeType){
            case "C":
                System.out.println("Enter radius : ");
                double radius=sc.nextDouble();

                System.out.println("Area of rectangle is : " + new Circle(radius).computeArea());
                break;
            case "R":
                System.out.println("Enter width : ");
                double width=sc.nextDouble();

                System.out.println("Enter height : ");
                double height=sc.nextDouble();
                System.out.println("Area of rectangle is : " + new Rectangle(width,height).computeArea());
                break;

            case "T":
                System.out.println("Enter base : ");
                double base=sc.nextDouble();

                System.out.println("Enter height : ");
                double height1=sc.nextDouble();
                System.out.println("Area of rectangle is : " + new Triangle(base,height1).computeArea());
                break;
            default:
                System.out.println("Invalid selection!!");
                break;
        }
        sc.close();
    }
}
