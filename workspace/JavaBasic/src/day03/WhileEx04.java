package day03;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		
		/*
		 * 첫째줄에 N의 개수가 주어진다.
		 * 그 다음줄 부터는 N번에 걸쳐서 입력을 받습니다.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i = 1;
		while(i <= n) { //입력받은 수까지 회전
			
			int a = scan.nextInt();
			System.out.println(a);
			
			i++;
		}
		
		scan.close();
		
		
		
		
		
		
		
	}
}
