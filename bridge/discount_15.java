package bridge;

public class discount_15 implements discount{

	@Override
	public double calc_disc(double price) {
		return 0.15*price;
	}

}
