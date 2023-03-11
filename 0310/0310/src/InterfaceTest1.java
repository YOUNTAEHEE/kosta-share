interface Fightable {
	void attack();
}

class Fighter extends Unit implements Fightable {

	@Override
	public void attack() {
		System.out.println("공격하고 있음");
	}

	@Override
	void move(int x, int y) {
		System.out.println("이동하고 있음");
	}
}

public class InterfaceTest1 {
	static void attack(Fightable  unit) {
		
	}
	public static void main(String[] args) {
		Fighter fighter1 = new Fighter();
		fighter1.attack();
		fighter1.move(0, 0);
		fighter1.stop();

		Unit fighter2 = new Fighter();  //upcasting
		fighter2.stop();
		fighter2.move(0, 0);
		//fighter2.attack();  //Unit에 없는 메소드 호출 불가
		
		Fightable fighter3 = new Fighter(); //interface로도 upcasting 가능(상속개념 적용됨).
		fighter3.attack();
		//fighter3.move(0,0);  //Fightable 에 없는 메소드 호출 불가
		//fighter3.stop();

		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship drapship = new Dropship();
		
		attack(fighter1);
		//attack(fighter2); //error
		attack(fighter3);
		attack(marine);  //error
		attack(tank);    //error 
		//attack(drapship);    //error
	}
}
