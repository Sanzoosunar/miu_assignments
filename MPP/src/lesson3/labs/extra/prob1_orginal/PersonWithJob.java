package lesson3.labs.extra.prob1_orginal;

public class PersonWithJob extends Person {
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	PersonWithJob(String n, double s) {
		super(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPersonWithJob) {

		if(aPersonWithJob == null) return false; 
		if(!(aPersonWithJob instanceof PersonWithJob)){
			//System.out.println("This instance is not a personwithJob");
			return false;
		}
		PersonWithJob p = (PersonWithJob)aPersonWithJob;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		System.out.println("Is really reaching here!");
		return isEqual;
	}
	public static void main(String[] args) {
		Person p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
