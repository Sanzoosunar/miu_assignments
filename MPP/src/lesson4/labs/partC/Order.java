package lesson4.labs.partC;

import java.time.LocalDate;

public class Order {
    private String orderNo;
    private LocalDate orderDate;
    private int orderAmount;
    private double orderPrice;

    Order(String orderNo,
          LocalDate orderDate,
          int orderAmount,
          double orderPrice){
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.orderPrice = orderPrice;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public int getOrderAmount() {
        return orderAmount;
    }
}
