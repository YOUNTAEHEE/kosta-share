import java.util.Scanner;

import emp.Employee;

public class Company {
	Employee[] emps = new Employee[100];
	int cnt;
	Scanner sc = new Scanner(System.in);
	
	int menu() {
		System.out.println("[코스타 주식회사]");
		System.out.println("0. 종료");
		System.out.println("1. 입사등록");
		System.out.println("2. 사원조회");
		System.out.println("3. 전체사원조회");
		System.out.println("4. 부서이동");
		System.out.println("5. 급여총금액");
		System.out.println("6. 급여변경");
		System.out.print("선택>> ");
		int sel = Integer.parseInt(sc.nextLine());
		return sel;
	}
	
	void changePay() {
		System.out.println("[급여변경]");
		Employee emp = null;
		while(true) {
			System.out.print("사번: ");
			String id=sc.nextLine();
			emp=searchEmpById(id);
			if(emp==null) {
				System.out.println("사번이 틀립니다.");
			} else {
				break;
			}
		}
		System.out.println("현재급여: "+emp.pay);
		System.out.print("변경할급여: ");
		int pay = Integer.parseInt(sc.nextLine());
		emp.pay=pay;
	}
	
	void enter() {
		System.out.println("[입사등록]");
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("부서: ");
		String department = sc.nextLine();
		System.out.print("급여: ");
		int pay = Integer.parseInt(sc.nextLine());
		
		if(department==null || department.length()==0) {
			emps[cnt++] = new Employee(name, pay);
		} else {
			emps[cnt++] = new Employee(name, department, pay);
		}	
	}
	
	Employee searchEmpById(String id) {
		Employee emp = null;
		for(int i=0; i<cnt; i++) {
			if(emps[i].id.equals(id)) {
				emp = emps[i];
				break;
			}
		}
		return emp;
	}
	
	void empInfo() {
		System.out.println("[사원조회]");
		Employee emp = null;
		while(true) {
			System.out.print("사번: ");
			String id = sc.nextLine();
			emp = searchEmpById(id);
			if(emp==null) {
				System.out.println("사번이 틀립니다.");
			} else {
				break;
			}
		}

//		do {
//			System.out.print("사번: ");
//			String id = sc.nextLine();
//			emp = searchEmpById(id);
//			if(emp==null) {
//				System.out.println("사번이 틀립니다.");
//			}
//		} while(emp==null);
		System.out.println(emp);
	}
	
	void allEmpInfo() {
		System.out.println("[전체사원조회]");
		for(int i=0; i<cnt; i++) {
			System.out.println(emps[i]);
		}
	}
	
	void transfer() {
		System.out.println("[부서이동]");
		//1. 사번을 입력 받는다.
		//2. 사번으로 검색한다.
		//3. 사번이 틀린지 체크한다.
		Employee emp = null;
		while(true) {
			System.out.print("사번: ");
			String id = sc.nextLine();
			emp = searchEmpById(id);
			if(emp==null) {
				System.out.println("사번이 틀립니다.");
			} else {
				break;
			}
		}
		//4. 현재 부서를 출력한다.
		System.out.println("현재부서: "+emp.department);
		//5. 이동할 부서를 입력받는다.
		System.out.print("이동할 부서: ");
		String tdepartment = sc.nextLine();
		//6. 부서를 변경한다.
		emp.department=tdepartment;
	}
	
	void totalPay() {
		int total = 0;
		for(int i=0; i<cnt; i++) {
			total += emps[i].pay;
		}
		System.out.println("급여총금액 : "+total+"원");
		//급여총금액 : ~원
	}
	
	public static void main(String[] args) {
		Company company = new Company();
		
		while(true) {
			int sel = company.menu();
			if(sel==0) break;
			switch(sel) {
			case 1: company.enter(); break;
			case 2: company.empInfo(); break;
			case 3: company.allEmpInfo(); break;
			case 4: company.transfer(); break;
			case 5: company.totalPay(); break;
			case 6: company.changePay(); break;
			}
		}
	}
}
/*
사번:1001, 이름:홍길동, 부서:홍보부, 급여:1000000
사번:1002, 이름:하길동, 부서:NONE, 급여:2000000
*/