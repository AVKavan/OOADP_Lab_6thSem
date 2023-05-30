package bridge;

public class discount_25 implements discount{

	@Override
	public double calc_disc(double price) {
		return 0.25*price;
	}

}
