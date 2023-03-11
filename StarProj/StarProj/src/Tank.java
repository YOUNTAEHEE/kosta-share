public class Tank extends GroundUint implements Repairable {
	public Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank";
	}
}
