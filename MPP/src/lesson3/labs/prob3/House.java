package lesson3.labs.prob3;

public class House extends Property{
	private double lotSize;

	public House(double lotSize,
				 String street,
				 String state,
				 String city,
				 String zip) {
		super(street, state, city, zip);
		this.lotSize = lotSize;
	}

	public double computeRent(){
		return 0.1 * lotSize;
	}
}
