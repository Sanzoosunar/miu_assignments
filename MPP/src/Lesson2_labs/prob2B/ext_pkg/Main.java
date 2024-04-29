package Lesson2_labs.prob2B.ext_pkg;

import Lesson2_labs.prob2B.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create order and create at least one orderLine
        Order order = new Order(LocalDate.now(), "MP346753", 4357, 2);

        // Add multiple OrderLines
        order.addOrderLine("PL2874567", 1200, 10);
        order.addOrderLine("ML8473632", 3780, 2);
        System.out.println(order);

        // Get order from orderLines
        List<OrderLine> list = order.getOrderLineList();
        System.out.println(" lists:" + list.get(0).getOrder());

    }
}
