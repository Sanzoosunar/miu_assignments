package lesson7.exercise;

interface Pizza {
    public void displaySize();
}

enum Size implements Pizza {
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    @Override
    public void displaySize() {
        System.out.println("The size is " + this);
    }
}

public class enumInherit {
    public static void main(String[] args) {
        Size s = Size.MEDIUM;
        s.displaySize();
        Size.MEDIUM.displaySize();
    }
}
