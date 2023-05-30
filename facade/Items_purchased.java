package facade;
import java.util.*;

public class Items_purchased {

	HashMap<String,Integer> items = new HashMap<>();
	int typecount;
	Scanner sc = new Scanner(System.in);
	
	Items_purchased()
	{
		store_purchase();
	}
	
	public void store_purchase()
	{
		System.out.println("Enter the number of types of items");
		typecount = sc.nextInt();
		
		System.out.println("Enter the items: ");
		for(int i=0;i<typecount;i++)
		{
			System.out.println("Enter the item name: ");
			String name = sc.next();
			System.out.println("Enter the quantity: ");
			int qty = sc.nextInt();
			
			items.put(name,qty);
		}
	}
	
	public  int getTypeCount()
	{
		return typecount;
	}
	
	public void display_items()
	{
		System.out.println("Items in the cart are : ");
		for(String key:items.keySet())
		{
			System.out.println("Item: "+key+" quantity: "+items.get(key));
		}
	}
	
}
