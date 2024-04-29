package lesson3.labs.prob3;

import java.util.List;

public class Admin {
	public static double computeTotalRent(List<Property> propertyList) {
		double totalRent = 0;
		for(Property property: propertyList){
			totalRent += property.computeRent();
		}
		return totalRent;
	}
}
