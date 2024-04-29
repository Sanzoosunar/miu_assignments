package lesson4.labs.partC;

import java.util.ArrayList;
import java.util.List;

public class Salaried extends Employee{
    private List<SalariedEntry> salariedEntry;

    public Salaried(String empId){
        super(empId);
        salariedEntry = new ArrayList<>();
    }
    @Override
    public double calcGrossPay(int year, int month) {
        SalariedEntry target = this.getSalariedEntryFromPayDate(year, month);
        return target.getSalary();
    }

    private SalariedEntry getSalariedEntryFromPayDate(int year,
                                                    int month){
        SalariedEntry targetSalariedEntry = null;
        PayDate targetPayDate = new PayDate(year, month);

        for(SalariedEntry salariedEntry: salariedEntry){
            if(salariedEntry.getPayDate().equals(targetPayDate)){
                targetSalariedEntry = salariedEntry;
            }
        }
        return targetSalariedEntry;
    }

    public void addSalariedEntry(double salary,
                                 int year,
                                 int month){
        salariedEntry.add(new SalariedEntry(salary, year, month));
    }
}
