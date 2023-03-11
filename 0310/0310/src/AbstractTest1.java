abstract class Player {
	int currentPos;
	
	Player() { 
		currentPos=0;
	}
	
	abstract void play(int pos);
	abstract void stop();
	
	void play() {
		play(currentPos);
	}
}

class Marine2 extends Player {

	@Override
	void play(int pos) {
		System.out.println(pos+"로 이동");
	}

	@Override
	void stop() {
		System.out.println("marie이 멈춤");
		
	}
}

public class AbstractTest1 {

	public static void main(String[] args) {
		Player p = new Marine2();
		p.play();
	}

}
