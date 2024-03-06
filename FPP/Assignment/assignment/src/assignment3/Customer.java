package assignment3;
public class Customer {
    public class Address {
        String street;
        String city;
        String state;
        String zip;

        Address(String street,
                String city,
                String state,
                String zip){
            this.street=street;
            this.city=city;
            this.state=state;
            this.zip=zip;
        }
    }
    String firstName;
    String lastName;
    String socSecurityNum;
    Address billingAddress;
    Address shippingAddress;

    Customer(String firstName,
             String lastName,
             String socSecurityNum){
        this.firstName=firstName;
        this.lastName=lastName;
        this.socSecurityNum=socSecurityNum;
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

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String street,String city,String state,String zip) {
        this.billingAddress = new Address(street,city,state,zip);
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String street,String city,String state,String zip) {
        this.shippingAddress = new Address(street,city,state,zip);
    }
    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";
    }
}
