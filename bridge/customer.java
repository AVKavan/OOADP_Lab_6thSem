package bridge;

public abstract class customer {
      discount disc;
      customer(discount disc)
      {
    	  this.disc = disc;
      }
      
      public abstract void get_discount(double price);
     
}
