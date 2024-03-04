package assignment5.question4;

public class Driver {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new CommissionEmployee("Luwan", "Zinhta", "123-45-6789", 5000, 0.1);
        employees[1] = new BasePlusCommissionEmployee("Asmina", "Hinsta", "987-65-4321", 10000, 0.05, 2000);
        employees[2] = new HourlyEmployee("Sanjukta", "Sunar", "234-56-7890", 15.50, 40);
        employees[3] = new SalariedEmployee("Phurpa", "Sampang", "345-67-8901", 800);
        employees[4] = new CommissionEmployee("Ibrahim", "Hussain", "456-78-9012", 3000, 0.15);

        double totalSalaries = 0.0;
        for (Employee employee : employees) {
            System.out.println(employee);
            totalSalaries += employee.getPayment();
        }

        System.out.println("Total Salaries: $" + totalSalaries);
    }
}
