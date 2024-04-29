package lesson4.labs.partC;

public final class Paycheck {
    private double grossPay;
    private final double state = 0.05;
    private final double fica = 0.23;
    private final double local = 0.01;
    private final double medicare = 0.03;
    private final double socialSecurity = 0.075;

    @Override
    public String toString() {
        return "  GrossPay: " + grossPay + "\n" +
                " State: " + grossPay * state + "\n" +
                        " fica: " + grossPay * fica + "\n" +
                        " local: " + grossPay * local + "\n" +
                        " medicare: " + grossPay * medicare + "\n" +
                        " socialSecurity: " + grossPay * socialSecurity + "\n" +
                        " NET PAY: " +  getNetPay() + "\n";
    }

    public Paycheck(double grossPay){
        this.grossPay = grossPay;
    }

    private double getNetPay(){
        return grossPay - ( grossPay * state - grossPay * fica - grossPay * local - grossPay * medicare - grossPay * socialSecurity);
    }

}
