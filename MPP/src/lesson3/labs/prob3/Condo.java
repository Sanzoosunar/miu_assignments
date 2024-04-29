package lesson3.labs.prob3;



public class Condo extends Property{
	private int numberOfFloors;


	public Condo(int numberOfFloors,
				 String street,
				 String state,
				 String city,
				 String zip) {
		super(street, state, city, zip);
		this.numberOfFloors = numberOfFloors;
	}

	public double computeRent(){
		return 500 * numberOfFloors;
	}
}
