package day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		//switch문장은 else if문과 90% 유사함
		Scanner scan = new Scanner(System.in);
		System.out.print("점수>");
		int point = scan.nextInt();
		
		//switch문장에 소괄호에는 변수 or 변수의 연산식 들어갈수 있음
		switch (  point / 10  ) { 
		case 9: //90~99
			
			if( point >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
			break;
		case 8: //80~89
			System.out.println("B학점");
			break;
		case 7: //70~79
			System.out.println("C학점");
			break;
		default:
			System.out.println("재수강");
			break;
		}
		
		
		
		
		
		
		
		
		
	}
}
