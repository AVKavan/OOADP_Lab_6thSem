package facade;

public class sports2000facade {

	process_sales p;
	Items_purchased i;
	
	sports2000facade(boolean cert, int amount)
	{
		i = new Items_purchased();
		p = new process_sales(cert, amount, i.getTypeCount());
	}
	
	public void display()
	{
		i.display_items();
	}
	
	public void process_cart()
	{
		p.process_order();
	}
}
