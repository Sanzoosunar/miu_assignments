package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private double maintenanceCost;
    private String buildingName;
    private List<Apartment> apartment = new ArrayList<>();

    Building(String buildingName,
             double maintenanceCost,
             String apartmentName,
             double rent){
        apartment.add(new Apartment(apartmentName, rent));
        this.buildingName = buildingName;
        this.maintenanceCost = maintenanceCost;
    }

    public void addApartment(String apartmentName,
                                  double rent){
        apartment.add(new Apartment(apartmentName, rent));
    }

    public double getProfit(){
        double apartmentProfit = 0;
        for(Apartment apart: apartment){
            apartmentProfit += apart.getRent();
        }

        return (apartmentProfit - maintenanceCost);
    }

}
