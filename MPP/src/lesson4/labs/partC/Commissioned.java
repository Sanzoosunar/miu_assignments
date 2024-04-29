package lesson4.labs.partC;

import java.util.ArrayList;
import java.util.List;

public class Commissioned  extends  Employee{
    private List<CommissionedEntry> commissionedEntry;
    public Commissioned(String empID){
        super(empID);
        commissionedEntry = new ArrayList<>();
    }

    @Override
    public double calcGrossPay(int year, int month) {
        CommissionedEntry target = this.getCommissionedEntryFromPayDate(year, month);

        //Get total value of orders
        double totalValueOfOrders = 0;
        for(Order order: target.getOrders()){
            totalValueOfOrders += order.getOrderPrice() * order.getOrderAmount();
        }

        return (target.getBaseSalary() + target.getCommission() * totalValueOfOrders);
    }

    public CommissionedEntry addCommissionedEntry(double baseSalary,
                                                  double commission,
                                                  int year,
                                                  int month){
        CommissionedEntry tmpCommissionedEntry = new CommissionedEntry(baseSalary,
                                                                       commission,
                                                                        year, month);
        commissionedEntry.add(tmpCommissionedEntry);
        return tmpCommissionedEntry;
    }

    private CommissionedEntry getCommissionedEntryFromPayDate(int year,
                                                              int month){
        CommissionedEntry targetCommissionedEntry = null;
        PayDate targetPayDate = new PayDate(year, month);

        for(CommissionedEntry commissionedEntry: commissionedEntry){
            if(commissionedEntry.getPayDate().equals(targetPayDate)){
                targetCommissionedEntry = commissionedEntry;
            }
        }
        return targetCommissionedEntry;
    }

}
