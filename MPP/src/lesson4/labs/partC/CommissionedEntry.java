package lesson4.labs.partC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommissionedEntry {
    private double baseSalary;
    private double commission;
    private PayDate payDate;
    private List<Order> orders;

    //package level access
    CommissionedEntry(double baseSalary,
                      double commission,
                      int year,
                      int month){
        this.baseSalary = baseSalary;
        this.commission = commission;
        this.payDate = new PayDate(year, month);
        orders = new ArrayList<>(); //create empty arraylist
    }

    public double getCommission() {
        return commission;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public PayDate getPayDate() {
        return payDate;
    }

    public void addOrder(String orderNo,
                         LocalDate orderDate,
                         int orderAmount,
                         double orderPrice){
        orders.add(new Order(orderNo, orderDate, orderAmount, orderPrice));
    }
}
