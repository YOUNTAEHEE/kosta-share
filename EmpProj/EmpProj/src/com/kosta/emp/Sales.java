package com.kosta.emp;

public class Sales extends Permanent implements IBusinessTrip {
	int incentive;
	public Sales() {}

	public Sales(String id, String name, int pay, int incentive) {
		super(id, name, pay);
		setIncentive(incentive);
	}

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	
	@Override
	public int getPay() {
		return super.getPay()+getIncentive();
	}

	@Override
	public void goBusinessTrip(int day) {
		incentive += (day*100000);
	}
	
}
