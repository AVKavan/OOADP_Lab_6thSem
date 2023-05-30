package bridge;

public class regular extends customer{

	regular(discount disc) {
		super(disc);
	}

	@Override
	public void get_discount(double price) {
		System.out.println("*****Regular customer****** ");
		double off = disc.calc_disc(price);
		System.out.println("Amount to pay is = "+(price - off));
	}

}
