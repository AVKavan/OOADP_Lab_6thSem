package template;

public class Main {

	public static void main(String args[])
	{    System.out.println("*********ONLINE********");
		Order_processing online = new Online();
		System.out.println("*********OFFLINE********");
		Order_processing offline = new Offline();
		
	}
}
