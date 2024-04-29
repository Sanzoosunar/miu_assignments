package lesson3.labs.prob3;


public class Trailer extends Property{
	private static final double RENT = 500;

	public Trailer(String street,
				   String state,
				   String city,
				   String zip) {
		super(street, state, city, zip);
	}
	public double computeRent(){
		return RENT;
	}
	
}
