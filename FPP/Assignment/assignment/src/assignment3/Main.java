package assignment3;

public class Main {
    public static void main(String[] args) {
        assignment3.Customer[] customerArray=new assignment3.Customer[3];
        assignment3.Customer customer=new assignment3.Customer("Arick","Jonson","71788989201");
        customer.setBillingAddress("South west","Chicago","IOWA","5257100");
        customer.setShippingAddress("South west","Chicago","IOWA","5257100");
        customerArray[0]=customer;

        customer=new assignment3.Customer("Zehnub","Khan","09098989");
        customer.setBillingAddress("South west","Florida","IOWA","5257100");
        customer.setShippingAddress("South west","Chicago","IOWA","5257100");
        customerArray[1]=customer;

        customer=new assignment3.Customer("Zehnub","Khan","09098989");
        customer.setBillingAddress("South west","Chicago","IOWA","5257100");
        customer.setShippingAddress("South west","Chicago","IOWA","5257100");
        customerArray[2]=customer;

        for (Customer obj : customerArray) {
            if(obj.getBillingAddress().city.equals("Chicago")){
                System.out.println(obj.toString());
            }
        }
    }
}
