public class Dropship extends AirUnit implements Repairable {
	public Dropship() {
		super(100);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Dropship";
	}
}
