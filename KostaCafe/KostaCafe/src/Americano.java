public class Americano extends Coffee implements IShot {
	public Americano(int price, boolean cold) {
		super(price,cold);
	}

	@Override
	public void addShot(int cnt) {
		shot+=cnt;
		price+=(cnt*SHOT_PRICE);
	}
	
	@Override
	String getName() {
		return "아메리카노";
	}
}
