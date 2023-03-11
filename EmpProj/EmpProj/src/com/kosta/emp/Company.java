package com.kosta.emp;

public class Company {
	Employee[] emps = new Employee[100];
	int cnt;
	
	public void enterEmp(Employee emp) {
		emps[cnt++] = emp;
	}
	
	public void allEmpInfo() {
		for(int i=0; i<cnt; i++) {
			System.out.println(emps[i]);
		}
	}
	
	public int getTotalPay() {
		int tot=0;
		for(int i=0; i<cnt; i++) {
			tot += emps[i].getPay();
		}
		return tot;
	}	
	
	public void regBusinessTrip(IBusinessTrip emp, int day) {
		emp.goBusinessTrip(day);
	}
}