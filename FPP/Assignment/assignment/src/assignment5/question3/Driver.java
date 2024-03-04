package assignment5.question3;

public class Driver {
    public static void main(String[] args) {
        Figure[] figures = {
                new UpwardHat(),
                new UpwardHat(),
                new DownwardHat(),
                new FaceMaker(),
                new Vertical()
        };

        for (Figure figure:figures){
            figure.getFigure();
        }
        System.out.println();
        for (Figure figure:figures){
            System.out.println();
            System.out.print(figure.getClass().getSimpleName() + " : ");
            figure.getFigure();
        }
    }
}
