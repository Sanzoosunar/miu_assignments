package lesson10.exercise;

public class enumIsFake {
    enum SIZE{SMALL, MEDIUM, BIG};
    public static void main(String[] args) {
        System.out.println(SIZE.MEDIUM);
        System.out.println(SIZE.valueOf("MEDIUM"));
    }
}
