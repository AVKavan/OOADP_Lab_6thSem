package factory_method;

public class customer_factory {

	customer getCustomer(String type)
	{
		if(type.equalsIgnoreCase("regular"))
			return new regular();
		else if(type.equalsIgnoreCase("senior"))
			return new senior();
		else 
			return new first_time();
	}
  
}
