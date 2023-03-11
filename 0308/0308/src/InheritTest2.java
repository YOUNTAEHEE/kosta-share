class Base {
	int bnum;

	Base() {
		System.out.println("Base()");
	}
	Base(int num) {
		bnum=num;
		System.out.println("Base(int num)");
	}
	
	void method1() {
		System.out.println("method1");
	}
}

class Derived extends Base {
	int dnum;
	//1. 자식 클래스가 생성자를 만들지 않으면 자식의 기본생성자가 자동 생성되고 부모의 기본생성자를 호출한다. 
	Derived() {
		System.out.println("Derived()");
	}
	Derived(int num) {
		dnum=num;
		System.out.println("Derived(int num)");
	}
	Derived(int bnum, int dnum) {
		//this.bnum=bnum;  //부모의 기본생성자 호출 후 부모 변수 초기화
		super(bnum);    //부모의 생성자를 통해 부모 변수 초기화
		this.dnum=dnum;
		System.out.println("Derived(int bnum, int dnum)");
	}
	
	void method1() {  //overriding : 부모의 메소드와 함수명과 파라미터가 같다.
		super.method1();
		System.out.println("derived method1");
	}
	
	void method1(int n) {
		System.out.println("derived method1");
	}
	void method2() {
		System.out.println("method2");
	}
}

public class InheritTest2 {

	public static void main(String[] args) {
		//Derived d1 = new Derived();
		//Derived d2 = new Derived(100);
		Derived d3 = new Derived(100,200);
		d3.method1();
		d3.method2();
	}

}
