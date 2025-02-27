package quiz02;

import java.util.Scanner;

public class Account {
	/*
	  	Account클래스
	  
		멤버변수
		이름 - String
		비밀번호 - String
		잔액 - int
		
		생성자
		(이름, 비밀번호, 잔액) 을 받아서 초기화 해주는 생성자 1개
		
		메서드
		입금기능 - deposit(int금액) : 반환 void - 잔액에 매개변수를 누적하는 기능
		출금기능 - withDraw(int금액) : 반환 int - 사용자에게 비밀번호를 입력받아서, 비밀번호가 일치하면, 잔액을 차감해하고, 출금값을 반환하는 기능
				 * 문자열의 비교 "문자열".equals("문자열") 
				 
		잔액조회 - getBalance() : 반환 int - 잔액을 반환하는 기능
	*/
	String name; //이름
	String password; //비밀번호
	int balance; //잔액 
	
	Account(String n, String pw, int bal) {
		name = n;
		password = pw;
		balance = bal;
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	int withDraw(int money) {
		//사용자에게 입력받은 값을 차감
		Scanner scan = new Scanner(System.in);
		System.out.print("비밀번호>");
		String pw = scan.next();
		
		if(password.equals(pw)) {
			balance -= money;
		} else {
			System.out.println("비밀번호가 틀렸습니다");
		}
		
		return balance;
	}
	
	int getBalance() {
		return balance;
	}
	
	
	
}
