package observer;

public class Demo {

	public static void main(String args[])
	{
		Customer c1 = new Customer("Raj");
		Customer c2 = new Customer("Rani");
		
		Store store = new Store();
		
		store.addObserver(c1);
		store.addObserver(c2);
		
		store.setDiscount("Holi", 15);
		
		System.out.println("*********");
		
		store.setDiscount("Ugadi", 20);
		
	}
}
