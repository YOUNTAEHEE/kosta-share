abstract public class Beverage {
	int price;
	boolean cold;
	
	public Beverage(int price, boolean cold) {
		this.price=price;
		this.cold=cold;
	}
	
	abstract String getName();
}
