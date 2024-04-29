package lesson3.labs.prob3;

public abstract class Property {
    private Address address;

    Property(String street,
             String state,
             String city,
             String zip){
        this.address = new Address(street,
                              state,
                              city,
                               zip);
    }
    public abstract double computeRent();
}
