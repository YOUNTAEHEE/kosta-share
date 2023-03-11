package com.kosta.emp;

public class Permanent extends Employee {
	int pay;
	
	public Permanent() {}

	public Permanent(String id, String name, int pay) {
		super(id, name);
		setPay(pay);
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

//	@Override
//	public String toString() {
//		return super.toString()+", 급여:"+getPay();
//	}
}
