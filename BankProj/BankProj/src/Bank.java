import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;

public class Bank {
	Account[] accs = new Account[100];
	int cnt;
	
	Scanner sc = new Scanner(System.in);
	
	int menu() {
		System.out.println("[코스타 은행]");
		System.out.println("0. 종료");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 전체계좌조회");
		System.out.print("선택>>");
		int sel = Integer.parseInt(sc.nextLine());
		return sel;
	}
	
	void makeAccountMenu() {
		System.out.println("[계좌개설]");
		System.out.println("1. 일반계좌");
		System.out.println("2. 특수계좌");
		System.out.print("선택>> ");
		int sel = Integer.parseInt(sc.nextLine());
		switch(sel) {
		case 1: makeAccount(); break;
		case 2: makeSpecialAccount(); break;
		}
	}
	
	void makeAccount() {
		System.out.println("[일반 계좌 개설]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("입금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		
		Account acc = searchAccById(id);
		if(acc!=null) {
			System.out.println("같은 계좌번호가 이미 있습니다.");
			return;
		}
		accs[cnt++] = new Account(id,name,money);
	}
	
	void makeSpecialAccount() {
		System.out.println("[특수 계좌 개설]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("입금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("등급 : ");
		String grade = sc.nextLine();
		
		Account acc = searchAccById(id);
		if(acc!=null) {
			System.out.println("같은 계좌번호가 이미 있습니다.");
			return;
		}
		accs[cnt++] = new SpecialAccount(id, name, money, grade);
	}
	
	Account searchAccById(String id) {
		Account acc = null;
		for(int i=0; i<cnt; i++) {
			if(accs[i].getId().equals(id)) {
				acc = accs[i];
				break;
			}
		}
		return acc;
	}
	
	void deposit() {
		System.out.println("[입금]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		System.out.print("입금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
		} else {
			acc.deposit(money);
		}
	}
	
	void withdraw() {
		System.out.println("[출금]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		System.out.print("출금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
		} else {
			acc.withdraw(money);
		}
	}
	
	void accountInfo() {
		System.out.println("[계좌 조회]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
		} else {
			System.out.println(acc.info()); 
		}
		
	}
	
	void allAccountInfo() {
		System.out.println("[전체 계좌 조회]");
		for(int i=0; i<cnt;i++) {
			System.out.println(accs[i].info());
		}
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		while(true) {
			int sel = bank.menu();
			if(sel==0) break;
			switch(sel) {
			case 1: bank.makeAccountMenu(); break;
			case 2: bank.deposit(); break;
			case 3: bank.withdraw(); break;
			case 4: bank.accountInfo(); break;
			case 5: bank.allAccountInfo();
			}
		}
	}
}