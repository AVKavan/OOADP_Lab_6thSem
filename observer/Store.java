package observer;
import java.util.*;

public class Store extends Subject {

	String fest_name;
	int discount;
	
	ArrayList<Observer> customers = new ArrayList<>();
	
	
	
	@Override
	public void addObserver(Observer o) {
		customers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		customers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer o: customers)
			o.update(fest_name, discount);
		
	}
	
	public void setDiscount(String fest_name,int discount)
	{
		this.fest_name = fest_name;
		this.discount = discount;
		notifyObservers();
	}
	
	

}
