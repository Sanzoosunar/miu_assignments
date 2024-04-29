package lesson3.labs.prob2;

public class Apartment {
    private String name;
    private double rent;

    //package level
    Apartment(String name,
              double rent){
        this.name = name;
        this.rent = rent;
    }

    public double getRent(){
        return rent;
    }
}
