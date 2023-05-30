package bridge;

public class discount_30 implements discount{

	@Override
	public double calc_disc(double price) {
		return 0.3*price;
	}

}
