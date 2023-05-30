package factory_method;

public class Main {

	public static void main(String args[]) {
    customer_factory cf = new customer_factory();
    
     customer c1 =cf.getCustomer("Regular");
     customer c2 =cf.getCustomer("Senior");
     customer c3 =cf.getCustomer("Fist_time");
     
     c1.getType();
     c2.getType();
     c3.getType();
	}
}
