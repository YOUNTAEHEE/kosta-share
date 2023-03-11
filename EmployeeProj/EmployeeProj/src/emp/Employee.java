package emp;

public class Employee {
	static int sid=1000;
	String id;
	String name;
	String department;
	int pay;
	
	Employee() {
		this.id=++sid+"";
	}
	Employee(String name, String department, int pay) {
		this.id=++sid+"";
		this.name=name;
		this.department=department;
		this.pay=pay;
	}
	Employee(String name, int pay) {
		this.id=++sid+"";
		this.name=name;
		this.department="NONE";
		this.pay=pay;
	}
	public String toString() {
		return "사번:"+id+", 이름:"+name+", 부서:"+department+", 급여:"+pay;
	}
}
