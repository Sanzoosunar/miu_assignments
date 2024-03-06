package assignment5.question5;

public class Main {
    public static void main(String[] args) {
        Computer comp=new Computer("HP", "AMD Ryzen 5", 8, 3.2);
        Computer comp0=new Computer("HP", "AMD Ryzen 5", 8, 3.2);
        Computer comp1=new Computer("Apple", "Apple M1", 32, 3.5);
        Computer comp2= new Computer("Lenovo", "Intel Core i5", 12, 2.8);

        //compare objects to check whether they are equal or not
        System.out.println("object comp and comp0 are same : " + comp.equals(comp0));
        System.out.println("object comp and comp1 are same : " + comp.equals(comp1));
        System.out.println("object comp1 and comp2 are same : " + comp1.equals(comp2));

        int hashCode=comp.hashCode();
        int hashCode0=comp0.hashCode();
        int hashCode1=comp1.hashCode();
        int hashCode2=comp2.hashCode();

        System.out.println("hash code of comp object : " + hashCode);
        System.out.println("hash code of comp0 object : " + hashCode0);
        System.out.println("hash code of comp1 object : " + hashCode1);
        System.out.println("hash code of comp2 object : " + hashCode2);

        System.out.println("hash code of comp and comp0 are same : " + (hashCode==hashCode0));
        System.out.println("hash code of comp0 and comp1 are same : " + (hashCode0==hashCode1));
        System.out.println("hash code of comp1 and comp2 are same : " + (hashCode1==hashCode2));
    }
}
