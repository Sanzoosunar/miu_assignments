package lesson4.labs.partC.ext_pkg;

import lesson4.labs.partC.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Add hourly paid employees
        List<Hourly> hourlyList = new ArrayList<>();
        Hourly hourly = new Hourly("HR54356");
        hourly.addHourlyEntry(100, 20, 2024, 1);
        hourly.addHourlyEntry(200, 20, 2024, 2);
        hourly.addHourlyEntry(300, 20, 2024, 3);
        hourlyList.add(hourly);


        // Add Salaried paid employee
        List<Salaried> salariedList = new ArrayList<>();
        Salaried salaried = new Salaried("EMP7749");
        salaried.addSalariedEntry(23000, 2024, 3);
        salariedList.add(salaried);

        // Add Commissioned paid employee
        List<Commissioned> commissionedList = new ArrayList<>();
        Commissioned commissioned = new Commissioned("CM87973");
        CommissionedEntry ce = commissioned.addCommissionedEntry(1200, 0.5, 2024, 3);
        ce.addOrder("MIU79373", LocalDate.now(), 1000, 10.0);
        ce.addOrder("MIU79373", LocalDate.now(), 1000, 10.0);
        ce.addOrder("MIU79373", LocalDate.now(), 1000, 10.0);
        ce.addOrder("MIU79373", LocalDate.now(), 1000, 10.0);
        commissionedList.add(commissioned);

        List<Employee> empl = new ArrayList<>();
        empl.addAll(hourlyList);
        empl.addAll(salariedList);
        empl.addAll(commissionedList);

        //Print polymorphic way
        for(Employee e: empl)
            e.print();
    }
}
