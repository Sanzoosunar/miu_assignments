package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandLord {
    private String name;
    private List<Building> buildings;

    LandLord(String name){
          this.name = name;
          buildings = new ArrayList<>();
    }

    public double getMonthlyProfit(){
        double profit = 0;
        for(Building building: buildings){
            profit += building.getProfit();
        }

        return profit;
    }

    public Building addBuilding(String buildingName,
                                double maintenanceCost,
                                String apartmentName,
                                double rent){
        Building building = new Building(buildingName,
                                         maintenanceCost,
                                         apartmentName,
                                          rent);
        buildings.add(building);
        return building;
    }
}
