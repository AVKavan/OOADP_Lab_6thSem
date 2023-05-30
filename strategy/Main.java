package strategy;
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Strategy St;
		double amt=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("1.New Customer \n2.Regular Customer \n3.Senior Citizen");
		System.out.println("Please select the type of customer");
		int type = sc.nextInt();
		System.out.println("Please Enter the totall price");
		double price = sc.nextDouble();
		
	
		if(type == 1)
		{
			St = new Strategy(new first_time());
			 amt = St.getDiscount(price);
			 System.out.println("Total amount to pay after discount is: "+amt);
		}
		else if(type == 2)
		{
			St = new Strategy(new regular());
			 amt = St.getDiscount(price);
			 System.out.println("Total amount to pay after discount is: "+amt);
		}
		else if(type == 3)
		{
			St = new Strategy(new senior());
			 amt = St.getDiscount(price);
			 System.out.println("Total amount to pay after discount is: "+amt);
		}
		else
			System.exit(0);
		}
		
		
		
		
	}
	
	
}
