package assignment8.prob2;
import java.util.*;

public class Statistics{
    /**
     * Polymorphically computes and returns the sum
     * of all the salaries of all the staff/teachers in the list.
     */
    public static double computeSumOfSalaries(List<EmployeeData> aList) {
        //return 0.00;
        //implement
        //compute sum of all salaries of people in aList and return
        double salarySum=0;
        for(EmployeeData emp:aList){
            salarySum+=emp.getSalary();
        }
        return salarySum;
    }
}
