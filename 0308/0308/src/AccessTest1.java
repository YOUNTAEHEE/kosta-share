import pac.ATest;

//다른 package에 있는 클래스 생성 및 접근
public class AccessTest1 {
	public static void main(String[] args) {
		ATest at1 = new ATest();
		//ATest at2 = new ATest(10); //다른 package에 있는 클래스의 생성자가 default일 경우 객체 생성 불가
		//BTest bt1 = new BTest();  /default class는 같은 package 에서만 사용 가능

		//at1.n = 10; //다른 package에 있는 클래스의 default 변수 접근 불가
		at1.setN(10); //다른 클래스의 변수는 set, get method를 통해 접근해야...
		int n = at1.getN();
		
		at1.m = 100; //다른 package라 할지라도 public 변수의 접근 가능.
		
		//at1.method(); //다른 package에 있는 클래스의 default 메서드 호출 불가
		at1.method2();
	}
}
