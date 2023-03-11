abstract public class Coffee extends Beverage {
	String bean;
	int shot=1;	
	
	public Coffee(int price, boolean cold) {
		super(price, cold);
	}

	public String getBean() {
		return bean;
	}

	public void setBean(String bean) {
		this.bean = bean;
	}
	
	@Override
	public String toString() {
		return getName()+":"+shot+"shot,"+price+"원";
	}

}
