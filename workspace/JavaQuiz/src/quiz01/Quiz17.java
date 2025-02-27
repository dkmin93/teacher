package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		/*
		 * 랜덤한 1~100사이의 수로 문제를 생성하고, 정답 맞추기 프로그램
		 * 1. 0을 입력하면 종료가 됩니다.
		 * 2. 종료될때는 정답, 오답 개수를 출력해 주세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int okCount = 0; //정답개수
		int noCount = 0; //오답개수
		
		while(true) {

			int a = (int)(Math.random() * 100) + 1;
			int b = (int)(Math.random() * 100) + 1;
			
			System.out.println("--------------");
			System.out.println(a + " + " + b + " = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int answer = scan.nextInt();
			
			if(answer == 0) {
				System.out.println("프로그램 종료!");
				break;
			}
			
			if(a + b == answer) { //정답인경우
				System.out.println("정답입니다");	
				okCount++;
			} else { //틀린경우
				System.out.println("틀렸습니다");
				noCount++;
			}

		}
		
		System.out.println("정답개수:" + okCount);
		System.out.println("오답개수:" + noCount);
		
		
		
		
		
	}
}
