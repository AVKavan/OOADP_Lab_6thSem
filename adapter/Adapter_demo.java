package adapter;
import java.util.*;

public class Adapter_demo {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	decathlon_tax dc = new MauriTax_adapter();
	System.out.println("Enter the total amount: ");
	double amt = sc.nextDouble();
	
	double tax = dc.calc_tax(amt);
	
	System.out.println("The tax is : "+tax);
	System.out.println("Now the final bill = "+(amt+tax));
 }
}
