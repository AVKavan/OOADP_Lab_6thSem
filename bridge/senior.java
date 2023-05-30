package bridge;

public class senior extends customer{

	senior(discount disc) {
		super(disc);
	}

	@Override
	public void get_discount(double price) {
		System.out.println("*****Senior customer****** ");
		double off = disc.calc_disc(price);
		System.out.println("Amount to pay is = "+(price - off));
	}

}

