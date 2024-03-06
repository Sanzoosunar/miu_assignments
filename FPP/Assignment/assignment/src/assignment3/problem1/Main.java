package assignment3.problem1;
public class Main {
    public static void main(String[] args) {
        Customer[] customerArray=new Customer[3];
        Customer customer=new Customer("Arick","Jonson","71788989201");
        customer.setBillingAddress("123 Main Street","Chicago","Illinois","60601");
        customer.setShippingAddress("123 Main Street","Chicago","Illinois","60601");
        customerArray[0]=customer;

        customer=new Customer("Zehnub","Khan","09098989");
        customer.setBillingAddress("456 Broadway","New York City","New York","10013");
        customer.setShippingAddress("456 Broadway","New York City","New York","10013");
        customerArray[1]=customer;

        customer=new Customer("Zakir","hussain","108899");
        customer.setBillingAddress("789 Sunset Boulevard", "Los Angeles", "California", "90028");
        customer.setShippingAddress("789 Sunset Boulevard", "Los Angeles", "California", "90028");
        customerArray[2]=customer;

        for (Customer obj : customerArray) {
            if(obj.getBillingAddress().city.equals("Chicago")){
                System.out.println(obj.toString());
            }
        }
    }
}
