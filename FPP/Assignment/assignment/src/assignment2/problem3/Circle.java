package assignment2.problem3;

public final class Circle {
    private final double radius;
    Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea(){
        return Math.PI*this.radius*this.radius;
    }
}
