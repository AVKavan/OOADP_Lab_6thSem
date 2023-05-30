package bridge;
import java.util.*;

public class Demo {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		customer cust;
		discount disc = null;
		
		while(true) {
		System.out.println("1.Regular\n2.Senior\n3.First TIme");
		System.out.println("Enter the type of customer");
		int type = sc.nextInt();
		
		System.out.println("***Discount to avail*****\n 1.30%\n2.25%\n3.20%4.15%");
		System.out.println("Enter the discount type");
		int disc_type = sc.nextInt();
		
		System.out.println("Enter the amount");
		double price = sc.nextDouble();
		
		switch(disc_type)
		{
		case 1: disc = new discount_30(); break;
		case 2: disc = new discount_25(); break;
		case 3: disc = new discount_20(); break;
		case 4: disc = new discount_15(); break;

		}
		
		if(type == 1)
		{
			cust = new regular(disc);
			cust.get_discount(price);
		
		}
		else if(type == 2)
		{
			cust = new senior(disc);
			cust.get_discount(price);
		}
		else if(type == 3)
		{
			cust = new first_time(disc);
			cust.get_discount(price);
		}
		else
			System.exit(0);
		}
		
	}
}
