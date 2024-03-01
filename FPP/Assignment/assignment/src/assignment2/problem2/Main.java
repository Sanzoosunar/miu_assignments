package assignment2.problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String fname=scanner.nextLine();
        System.out.println("Enter your last name : ");
        String lname = scanner.next();
        System.out.println("Enter your date of birth : ");
        String dob = scanner.next();

        HeartRates hr=new HeartRates(fname,lname,dob);
        hr.targetHeartRate();
        System.out.println(hr);
    }
}
