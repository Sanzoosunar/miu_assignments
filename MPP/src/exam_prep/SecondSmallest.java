package exam_prep;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Manager extends Employee{
    double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class SecondSmallest {
    public static <T> T getSecondSmallest(List<T> lst, Comparator<T> comparator){
             return    lst.stream()
                            .sorted(comparator)
                .collect(Collectors.toList()).get(1);
    }

    public static void main(String[] args) {
//        List<String> str= Arrays.asList("Sanju","Sunar","Apple","Banana");
//        String secondSmallest=getSecondSmallest(str,Comparator.comparing((String s)->s));
//        System.out.println("Second small : " + secondSmallest);
//
//        List<Employee> empList=Arrays.asList(
//                new Employee("Alice",70000),
//                //new Employee("Alice",80000),
//                new Employee("Bunty", 85000),
//                new Employee("Carol", 90000),
//                new Employee("David", 87000),
//                new Employee("Eve", 92000),
//                new Manager("Bob", 92000,1000)
//        );
//        Employee second=getSecondSmallest(empList,Comparator.comparing((Employee e)->e.getName()));
//        System.out.println("emp : " + second);

        List<LocalDate> localDateList=new ArrayList<>();
        localDateList.add(LocalDate.of(2022,1,12));
        localDateList.add(LocalDate.of(2021,1,12));
        localDateList.add(LocalDate.of(2020,1,12));
        localDateList.add(LocalDate.of(2019,1,12));
        localDateList.add(LocalDate.of(2018,1,12));

        System.out.println(getMax(localDateList));
        //System.out.println(localDateList);
    }

    public static  <T extends Comparable<? super T>> T getMax(List<T> lst){
        T max=lst.get(0);
        for (int i=1;i<lst.size();i++){
            if(max.compareTo(lst.get(i))<0){
                max=lst.get(i);
            }
        }
        return max;
    }
}
