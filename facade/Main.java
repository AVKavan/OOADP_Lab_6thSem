package facade;

public class Main {

	public static void main(String args[])
	{
		sports2000facade sp = new sports2000facade(true, 2140);
		sp.display();
		sp.process_cart();
	}
}
