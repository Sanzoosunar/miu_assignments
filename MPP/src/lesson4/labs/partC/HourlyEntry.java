package lesson4.labs.partC;

public class HourlyEntry {
    private double hourlyWage;
    private double hoursPerWeek;
    private PayDate payDate;

    HourlyEntry(double hourlyWage,
                double hoursPerWeek,
                int year,
                int month){
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
        this.payDate = new PayDate(year, month);
    }

    public PayDate getPayDate(){
        return payDate;
    }

    @Override
    public String toString() {
        return "HourlyEntry{" +
                "hourlyWage=" + hourlyWage +
                ", hoursPerWeek=" + hoursPerWeek +
                ", payDate=" + payDate +
                '}';
    }

    public double getHourlyWage(){
        return hourlyWage;
    }

    public double getHoursPerWeek(){
        return hoursPerWeek;
    }

}
