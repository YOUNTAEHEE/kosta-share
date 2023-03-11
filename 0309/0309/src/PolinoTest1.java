
public class PolinoTest1 {
	public static void main(String[] args) {
		
		SpecialAccount sacc = new SpecialAccount("1001", "홍길동", 100000, "VIP");
		sacc.deposit(10000);
		System.out.println(sacc.info());
		sacc.withdraw(5000);
		System.out.println(sacc.info());
		
		Account acc = new SpecialAccount("1002", "김길동", 200000, "Gold"); //upcasting(자식 객체를 부모타입의 변수에 할당한다.)
		//String grade = acc.getGrade(); //부모 타입의 변수로 자식만이 가지고 있는 속성과 메소드에 접근할 수 었다.
		System.out.println(acc.info());  //부모 타입의 레퍼런스라 하더라도 자식 객체를 담고 있으면 오버라이딩한 자식의 메소드를 호출한다.(다형성)
		
		//SpecialAccount acc2 = (SpecialAccount)acc;// new Account("1003","차길동",300000);  //downcasting
		
	}
}
