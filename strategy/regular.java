package strategy;

public class regular extends pricing_strategy {
	
		public double calcamt(double price) {			
			return 0.12*price;		
		}
}
