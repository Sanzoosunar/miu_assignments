package lesson7.lecture.defaultmethods;

import java.util.Collection;
import java.util.Collections;

public interface NameAddress {
	String getFirstName();
	String getLastName();
	String getStreet();
	String getCity();
	String getState();
	default String getFullName() {
		return getFirstName() + " " + getLastName();
	}
	default String getFullAddress() {
		return getStreet() + "\n" + getCity() + ", " + getState();
	}
	default String formattedOutput() {
		return getFullName() + "\n" + getFullAddress();
	}
	
}
class Test implements NameAddress{
	public static void main(String[] args) {
		var d=new Test();
//		Collection
		//d.getFullName();
	}

	@Override
	public String getFirstName() {
		return null;
	}

	@Override
	public String getLastName() {
		return null;
	}

	@Override
	public String getStreet() {
		return null;
	}

	@Override
	public String getCity() {
		return null;
	}

	@Override
	public String getState() {
		return null;
	}
}