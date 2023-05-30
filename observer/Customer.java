package observer;

public class Customer implements Observer {
    String name;
    Customer(String name)
    {
    	this.name = name;
    }
	
	@Override
	public void update(String fest_name, int discount) {
		System.out.println("Customer: "+name+" ,get around "+discount+"% on this "+fest_name);
		
	}

}
