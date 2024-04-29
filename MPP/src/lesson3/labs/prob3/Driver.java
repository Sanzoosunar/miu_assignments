package lesson3.labs.prob3;

import lesson3.labs.prob3.*;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Condo> condoList = new ArrayList<>();
		condoList.add(new Condo(2, "200 Forest Ave", "Fairfield", "IA", "52556"));

		List<Trailer> trailerList = new ArrayList<>();
		trailerList.add(new Trailer("10 N. 4th St.", "Fairfield", "IA", "52556"));

		List<House> houseList = new ArrayList<>();
		houseList.add(new House(1200.0, "111 Main", "Fairfield", "IA", "52556"));

		List<Property> propertyList = new ArrayList<>();
		propertyList.addAll(condoList);
		propertyList.addAll(trailerList);
		propertyList.addAll(houseList);

		double totalRent = Admin.computeTotalRent(propertyList);
		System.out.println(totalRent);
	}
}
