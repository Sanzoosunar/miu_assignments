package Lesson2_labs.prob2B;

public class OrderLine {
    private String orderLineNum;
    private double price;
    private int quantity;

    private Order order;

     OrderLine(String orderLineNum,
              double price,
              int quantity,
              Order order){
        this.orderLineNum = orderLineNum;
        this.price = price;
        this.quantity = quantity;
        this.order = order;
    }

    public Order getOrder(){
        return order;
    }

    @Override
    public String toString() {
        return  "orderLineNum='" + orderLineNum + '\'' +
                ", price=" + price +
                ", quantity=" + quantity;
    }
}
