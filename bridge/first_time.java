package bridge;

public class first_time extends customer{

	first_time(discount disc) {
		super(disc);
	}

	@Override
	public void get_discount(double price) {
		System.out.println("*****First_time customer****** ");
		double off = disc.calc_disc(price);
		System.out.println("Amount to pay is = "+(price - off));
	}

}

