package lesson5.exercise;

public class Rectangle {
    private double side1;
    private double side2;
    private double diagonal;

    private Rectangle(double side){
        this.side1 = side;
    }

    static Rectangle getRectangleFromSides(double side1, double side2){
        Rectangle r = new Rectangle(side1);
        r.side2  = side2;
        return r;
        //logic
    }

    static Rectangle getRectangleFromSideDiagonal(double side1, double diagonal){
        Rectangle r = new Rectangle(side1);
        r.diagonal = diagonal;
        return r;
    }

    double computeArea(){
        return side1;
    }

    public static void main(String[] args) {
        Rectangle r = Rectangle.getRectangleFromSideDiagonal(4, 6);
        r.computeArea();
    }
}
