package assignment5.question4;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber,
                              double grossSales,
                              double commissionRate){
        super(firstName,lastName,socialSecurityNumber);
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }

    public double getGrossSalary() {
        return grossSales;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSales = grossSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPayment(){
        return this.grossSales*this.commissionRate;
    }
}
