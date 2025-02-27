package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		/*
		 * 어떤 수 1개를 입력 받습니다.
		 * 이 숫자가 홀수, 짝수, 0, 음수 인지를 구분해서 출력.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int a = scan.nextInt();
		
		if(a == 0) { //ㄳ
			System.out.println("0 입니다");
		} else if(a < 0) {
			System.out.println(a + "는 음수 입니다");
		} else if(a % 2 == 0) { 
			System.out.println(a + "는 짝수 입니다");
		} else {
			System.out.println(a + "는 홀수 입니다");
		}
		
		scan.close();
		
		
		
		
		
		
	}
}
