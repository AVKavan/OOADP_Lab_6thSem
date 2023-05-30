package adapter;

public class MauriTax_adapter extends MauriTax implements decathlon_tax{

	@Override
	public double calc_tax(double amt) {
		
		return m_tax(amt);
	}

}
