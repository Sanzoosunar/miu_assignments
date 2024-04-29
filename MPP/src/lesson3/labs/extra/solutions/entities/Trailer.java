package mpp_lab.Lab3.prob3.solutions.entities;

public class Trailer extends Property{
    private static final double RENT = 500;
    public Trailer(Address address) {
        super(address);
    }
    @Override
    public double computeRent(){
        return RENT;
    }
}
