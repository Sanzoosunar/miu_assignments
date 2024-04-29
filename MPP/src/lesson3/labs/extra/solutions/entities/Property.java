package mpp_lab.Lab3.prob3.solutions.entities;

//import mpp_lab.Lab3.prob3.solutions.entities.Address;

public abstract class Property {
     Address address;
     public Property(Address address){
         this.address=address;
     }

    public abstract double computeRent();

}
