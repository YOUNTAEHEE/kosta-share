public class Cafe {
	Beverage[] cart = new Beverage[100];
	int cnt;
	
	public void addBeverage(Beverage beverage) {
		cart[cnt++] = beverage;
	}
	
	public void addShot(IShot beverage, int cnt) {
		beverage.addShot(cnt);
	}
	
	public void changeMilk(ILatte beverage, String milk) {
		beverage.changeMilk(milk);
	}
	
	public void calculate() {
		int tot=0;
		for(int i=0; i<cnt; i++) {
			tot += cart[i].price;
			System.out.println(cart[i]);
		}
		System.out.println("총 가격:"+tot+"원");
	}
	
	public static void main(String[] args) {
		Americano americano = new Americano(1500, true);
		CafeLatte latte = new CafeLatte(2000, false);
		CafeMoca moca = new CafeMoca(2500,true);
		StrawberryLatte slatte = new StrawberryLatte(2500);
		
		Cafe cafe = new Cafe();
		
		cafe.addShot(americano, 1);
		cafe.addShot(latte, 1);
		//addShot(moca, 1);
		
		//changeMilk(americanoa, "soya oil");
		cafe.changeMilk(latte, "soy");
		cafe.changeMilk(slatte, "soy");
		
		cafe.addBeverage(americano);
		cafe.addBeverage(latte);
		cafe.addBeverage(moca);
		cafe.addBeverage(slatte);
		
		cafe.calculate();
	}
}