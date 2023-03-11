abstract public class EtcBeverage extends Beverage {
	public EtcBeverage(int price, boolean cold) {
		super(price, cold);
	}
	
	@Override
	public String toString() {
		return getName()+":"+price+"원";
	}
}
