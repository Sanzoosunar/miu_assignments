package mpp_lab.Lab3.prob3.solutions.entities;

public class Condo extends Property{
    private int numberOfFloors;
    public Condo(Address address, int numberOfFloors) {
       super(address);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public double computeRent(){
        return 500 * numberOfFloors;
    }
}
