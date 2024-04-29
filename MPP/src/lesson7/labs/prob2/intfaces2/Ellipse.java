package lesson7.labs.prob2.intfaces2;

public class Ellipse implements ClosedCurve{
    private double a;
    private double E;

    Ellipse(double a, double E){
        this.a = a;
        this.E = E;
    }

    public double computePerimeter() {
        return 4*a*E;
    }
}
