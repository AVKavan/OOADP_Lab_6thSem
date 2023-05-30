package facade;
import java.util.*;

public class process_sales {

	boolean cert;
	int amount;
	int qty;
	Scanner sc = new Scanner(System.in);
	public process_sales(boolean cert, int amount, int qty) {
	
		this.cert = cert;
		this.amount = amount;
		this.qty = qty;
	}
	
	public void process_order()
	{
		if(!cert)
			System.out.println("No gift certtificate chosen, can't avail the benefit");
		else {
			System.out.println("Enter the gift amoutn value: ");
			int cert_value = sc.nextInt();
		 if(qty <= 0)
			System.out.println("No items chosen in the cart");
		else if(qty > 1)
			System.out.println("Can't avail benefit for more than one item");
		else if(amount > cert_value )
			System.out.println("Gift card availed , pay balance amount of rupees: "+(amount-cert_value));
		else 
			System.out.println("Gift card availed!");
		}
	}
	
	
}
