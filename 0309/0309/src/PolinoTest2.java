
public class PolinoTest2 {
	static Account[] accs = new Account[100];
	static int cnt;
	
	static void addAccount(Account acc) {
		accs[cnt++] = acc;
	}
	static void allAccountInfo() {
		for(int i=0; i<cnt; i++) {
			//if(!(accs[i] instanceof SpecialAccount)) {
				System.out.println(accs[i].info());
			//}
		}
	}
	
	static void allSpecialAccountInfo() {
		for(int i=0; i<cnt; i++) {
			if(accs[i] instanceof SpecialAccount) {
				System.out.println(accs[i].info());
			}
		}
	}
	static Account searchAccById(String id) {
		Account acc = null;
		for(int i=0; i<cnt; i++) {
			if(accs[i].getId().equals(id)) {
				acc = accs[i];
				break;
			}
		}
		return acc;
	}
	
	static void deposit(String id, int money) {
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		
		acc.deposit(money);
	}
	static void withdraw(String id, int money) {
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		
		acc.withdraw(money);	
	}
	public static void main(String[] args) {
		Account acc1 = new Account("1001","hong",100000);
		SpecialAccount acc2 = new SpecialAccount("1002","go",200000,"VIP");
		SpecialAccount acc3 = new SpecialAccount("1003","ha",100000,"Gold");

		addAccount(acc1);
		addAccount(acc2);
		addAccount(acc3);
			
		//allSpecialAccountInfo();
		deposit("1001",10000);
		deposit("1002",10000);
		deposit("1003",10000);
		
		allAccountInfo();	
		
		withdraw("1001", 5000);
		withdraw("1002", 5000);
		
		allAccountInfo();
	}

}
