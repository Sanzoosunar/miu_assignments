package mpp_lab.Lab3.prob3.solutions.entities;

//import mpp_lab.Lab3.prob3.solutions.entities.Address;

public class House extends Property{
    private double lotSize;
    public House(Address address, double lotSize) {
        super(address);
        this.lotSize = lotSize;
    }

    @Override
    public double computeRent() {
        return 0.1 * lotSize;
    }
}
