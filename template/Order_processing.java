package template;

public abstract class Order_processing {
 
	Order_processing()
	{
		selectItem();
		doPayment();
		doDelivery();
	}
	
	abstract void selectItem();
	abstract void doPayment();
	abstract void doDelivery();
}
