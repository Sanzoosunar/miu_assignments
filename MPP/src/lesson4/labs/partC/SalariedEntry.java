package lesson4.labs.partC;

public class SalariedEntry {
    private double salary;
    private PayDate payDate;

    //package level access
    SalariedEntry(double salary,
                  int year,
                  int month){
        this.salary = salary;
        this.payDate = new PayDate(year, month);
    }

    public double getSalary() {
        return salary;
    }

    public PayDate getPayDate() {
        return payDate;
    }

    @Override
    public String toString() {
        return "SalariedEntry{" +
                "salary=" + salary +
                ", payDate=" + payDate +
                '}';
    }
}
