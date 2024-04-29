package lesson8.exercise;

public class LambdaExample {
    private static final String HELLO = "Hello World!";

    public LambdaExample(String s) {
    }

    public static void main(String[] args) throws Exception {
        Runnable r = () -> System.out.println(HELLO);
        Thread t = new Thread(r);
        t.start();
        t.join();
    }
}