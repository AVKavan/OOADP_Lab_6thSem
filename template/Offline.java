package template;

public class Offline extends Order_processing {

	
	int total =0;
	@Override
	void selectItem() {
		
		System.out.println("Chosen Items: ");
		System.out.println("Item 1:  300/-");
		System.out.println("Item 2:  200/-");
		System.out.println("Item 3:  400/-");
		
		total = 300+200+400;
		
	}

	@Override
	void doPayment() {
		System.out.println("Pay the total of"+total+" through\n1.cash\n2.card");
		
	}

	@Override
	void doDelivery() {
		System.out.println("Thank you for shopping,Collect you items at counter 1");
	
	}

}
