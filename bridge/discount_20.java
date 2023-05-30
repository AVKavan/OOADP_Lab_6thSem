package bridge;

public class discount_20 implements discount{

	@Override
	public double calc_disc(double price) {
		return 0.2*price;
	}

}
