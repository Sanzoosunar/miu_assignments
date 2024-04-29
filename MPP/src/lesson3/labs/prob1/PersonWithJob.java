package lesson3.labs.prob1;

public class PersonWithJob{
	
	private double salary;
	private Person person;

	public double getSalary() {
		return salary;
	}

	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}

	public static void main(String[] args) {
		PersonWithJob personWithJob = new PersonWithJob("Hadush", 34500);
		System.out.println(personWithJob.getSalary());
	}


}
