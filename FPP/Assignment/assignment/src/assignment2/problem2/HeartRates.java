package assignment2.problem2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    String firstName;
    String lastName;

    String dateOfBirth;

    AgeCalculator ageCalculator;

    static int restingHeartRate=70;
    static double lowerBoundary=0.5;
    static double upperBoundary=0.85;

    HeartRates(String firstName,
               String lastName,
               String dateOfBirth){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;
        this.ageCalculator=new AgeCalculator();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        return ageCalculator.calculateAge(LocalDate.parse(this.dateOfBirth, ageCalculator.formatter)).getYears();
    }

    public double getMaximumHeartRate(){
        return 220-getAge();
    }
    public void targetHeartRate(){

        double averageHeartRate = restingHeartRate-getMaximumHeartRate();
        double LBTHR=(averageHeartRate*lowerBoundary)+restingHeartRate;
        double UBTHR=(averageHeartRate*upperBoundary)+restingHeartRate;
        System.out.println("Target Heart Rate Range is between " + LBTHR + " and " + UBTHR);
    }

    public String toString() {
        return "First Name: " + firstName + " \nLast Name: " + lastName + "\nAge: " + getAge() + "\nDate of Birth: " + dateOfBirth +
                " \nMaximum Heart Rate (MHR): " + getMaximumHeartRate();
    }
}
