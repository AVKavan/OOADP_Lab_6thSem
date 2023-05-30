package template;

public class Online extends Order_processing {

	
	int total =0;
	@Override
	void selectItem() {
		
		System.out.println("Chosen Items comparison ");
		System.out.println("Item 1:  300/-");
		System.out.println("Item 2:  200/-");
		System.out.println("Item 3:  400/-");
		
		total = 300+200+400;
		
	}

	@Override
	void doPayment() {
		System.out.println("Pay the total of"+total+" through net-banking");
		
	}

	@Override
	void doDelivery() {
		int Shipcharges = 100;
		String address ="Banglore";
		System.out.println("Shipping charges is "+Shipcharges+",Items will be delivered to address: "+address);
		System.out.println("Your total including shipping charges is : "+(total+Shipcharges));
	
	}

}
