package assignment5.question1;

public class Rectangle extends Shape{
    double width;
    double height;
    public Rectangle(String color,double aWidth,double aHeight){
        super(color);

        this.width=aWidth;
        this.height=aHeight;
    }

    @Override
    public double calculateArea(){
        return width * height;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * (width + height);
    }
}
