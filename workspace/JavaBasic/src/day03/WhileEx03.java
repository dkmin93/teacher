package day03;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		
		//while조건은 다양한 형식으로 만들어 질 수도 있음.
		//어떤 수를 입력받아서, 이 수가 소수(약수가 1과 자기자신인 수)인지 확인.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int num = scan.nextInt();
		
		int i = 2; //
		while(num % i != 0) { //1바퀴만 해석해서 돌려보면
			i++;
		}
		
		//누가 누구면, 누구를 소수할 수 있음.
		if(i == num) {
			System.out.println(num + "는 소수입니다");
		} else {
			System.out.println(num + "는 소수가 아닙니다");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
