package mpp_lab.Lab3.prob3.solutions;

import mpp_lab.Lab3.prob3.solutions.entities.*;


public class Driver {
    public static void main(String[] args) {
        Address[] addresses = {
                new Address("111 Main", "Fairfield", "IA", "52556"),
                new Address("200 Forest Ave", "Fairfield", "IA", "52556"),
                new Address("10 N. 4th St.", "Fairfield", "IA", "52556")
        };

        Property[] propertyList = {
                new House(addresses[0], 1200.0),
                new Condo(addresses[1], 2),
                new Trailer(addresses[2])
        };

        double totalRent=0;
        for(Property property:propertyList){
            totalRent+=property.computeRent();
        }
        System.out.println(totalRent);
    }
}
