package lesson3.labs.prob2;

public class Main {
    public static void main(String[] args) {
        LandLord landLord = new LandLord("hadush");
        Building building = landLord.addBuilding("H3", 30, "104", 800);
        building.addApartment("105", 800);
        building.addApartment("106", 800);
        building.addApartment("107", 800);
        building.addApartment("108", 800);

        Building building1 = landLord.addBuilding("H2", 10, "104", 800);
        building1.addApartment("105", 800);

        //landlords profit is: (building - 30) + (building1 - 10) = (5*800-30) + (2*80 - 10) = 5560
        System.out.println(landLord.getMonthlyProfit());

    }
}
