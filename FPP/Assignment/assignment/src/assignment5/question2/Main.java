package assignment5.question2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("John Smith", LocalDate.of(2010, 5, 15), 60000, 20);
        Professor prof2 = new Professor("Jane Doe", LocalDate.of(2015, 9, 20), 70000, 15);
        Professor prof3 = new Professor("Alice Johnson", LocalDate.of(2018, 3, 10), 55000, 25);
        Secretary sec1 = new Secretary("Emily Brown", LocalDate.of(2012, 8, 8), 40000, 10);
        Secretary sec2 = new Secretary("Michael Clark", LocalDate.of(2016, 11, 25), 45000, 8);

        DeptEmployee[] department = { prof1, prof2, prof3, sec1, sec2 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to see the sum of all Professor and Secretary salaries? (Y/N): ");
        String response = scanner.next();

        if (response.equalsIgnoreCase("Y")) {
            double totalSalaries = 0;
            // Calculate the sum of all salaries
            for (DeptEmployee employee : department) {
                totalSalaries += employee.computeSalary();
            }
            System.out.println("Total combined salaries of all professors and secretaries: $" + totalSalaries);
        } else {
            System.out.println("End!!");
        }
    }
}
