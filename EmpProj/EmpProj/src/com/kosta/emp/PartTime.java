package com.kosta.emp;

public class PartTime extends Employee implements IBusinessTrip {
	int time;
	int payPerTime;
	
	public PartTime() {}

	public PartTime(String id, String name, int time, int payPerTime) {
		super(id, name);
		setTime(time);
		setPayPerTime(payPerTime);
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPayPerTime() {
		return payPerTime;
	}

	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}
	
	public int getPay() {
		return getTime()*getPayPerTime();
	}

	@Override
	public void goBusinessTrip(int day) {
		time += (day*24);		
	}
	
//	@Override
//	public String toString() {
//		return super.toString()+", 급여:"+getPay();
//	}

}
