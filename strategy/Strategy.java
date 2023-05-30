package strategy;

public class Strategy {
             pricing_strategy cust;
             store_disc Sd = new store_disc();
	  Strategy(pricing_strategy cust)
	  {
		  this.cust = cust;
	  }
	  
	  double getDiscount(double price)
	  {
		  double iamt = Sd.discount(price);
		  double famt = cust.calcamt(iamt);
		  double fdisc = price - famt;
		  return fdisc;
	  }
	
	
	
}
