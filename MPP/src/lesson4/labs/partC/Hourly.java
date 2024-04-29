package lesson4.labs.partC;

import java.util.ArrayList;
import java.util.List;

public class Hourly extends Employee{
    private List<HourlyEntry> hourlyEntry;

    public Hourly(String empId){
        super(empId);
        //Create Empty hourly entry: it's a [o..*] association
        hourlyEntry = new ArrayList<>();
    }

   @Override
   public double calcGrossPay(int year,
                             int month){
       HourlyEntry target = this.getHourlyEntryFromPayDate(year, month);
       return (target.getHourlyWage() * target.getHoursPerWeek() * 4);
   }

   private HourlyEntry getHourlyEntryFromPayDate(int year,
                                    int month){
        HourlyEntry targetHourlyEntry = null;
        PayDate targetPayDate = new PayDate(year, month);

        for(HourlyEntry hourlyEntry: hourlyEntry){
            if(hourlyEntry.getPayDate().equals(targetPayDate)){
                targetHourlyEntry = hourlyEntry;
            }
        }
        return targetHourlyEntry;
   }

   public void addHourlyEntry(double hourlyWage,
                              double hoursPerWeek,
                              int year,
                              int month){

        hourlyEntry.add(new HourlyEntry(hourlyWage,
                                        hoursPerWeek,
                                        year,
                                        month));
   }
}
