class Test {
	final int NUM;
	//instance final 변수는 생성자에서 초기화해야 한다. 
	//명시적 초기화도 가능하지만 그럴경우 모두 객체들이 같은 상수값을 사용해야만 한다.(명시적 초기화를 할 경우 static final이 훨씬 효과적이다)
	Test(int n) {   
		NUM = n;
	}
//	void setNUM(int num) {  //final 변수는 변경이 불가하기 때문에 set 함수도 사용하지 않는다.
//		NUM=num;
//	}
}
final class Test2 {}
//class Test3 extends Test2 {} //final class 상속 불가

class Test4 {
	final void method() {}
}

class Test5 extends Test4 {
	//void method() {}   //final method override 불가
}

public class FinalTest1 {
	public static void main(String[] args) {
		final int n;
		n=10;
		//n=20;  //초기화는 한번만. 이후는 변경으로 간주되어 불가
	}
}
