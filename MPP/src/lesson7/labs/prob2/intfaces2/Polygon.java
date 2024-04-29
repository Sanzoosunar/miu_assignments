package lesson7.labs.prob2.intfaces2;

public interface Polygon extends ClosedCurve{
    public default double computePerimeter(){
        double perimeter = 0;
        for(double s: getSides()){
            perimeter += s;
        }
        return perimeter;
    }

    public double[] getSides();
}

