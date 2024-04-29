package lesson4.labs.partC;

import java.time.LocalDate;
import java.util.Date;

public abstract class Employee {
    private String empId;

    Employee(String empId){
        this.empId = empId;
    }

    public void print(){
        //LocalDate now = LocalDate.now();
        System.out.println( "EmployeeID: " + empId + "\n" + "Paystub:\n" + calcCompensation(2024, 3));
    }

    public Paycheck calcCompensation(int year,
                                     int month){
        return new Paycheck(calcGrossPay(year, month));
    }

    public abstract double calcGrossPay(int year,
                                        int month);

}
