package assignment1;

public class Prog4 {
    public static void main(String[] args) {
        float a = 1.27f;
        float b = 3.881f;
        float c = 9.6f;
        int sum = (int) (a+b+c);
        System.out.println(sum);

        sum = Math.round(a+b+c);
        System.out.println(sum);
    }
}
