package quiz01;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		//숙제
		/*
		 * 어떤수를 입력 받아서, 입력받은 수 까지의 모든 소수들의 합계를 구합니다.
		 * 소수 - 약수가 1과 자기자신인 수 (약수의 개수가 2개)
		 * 
		 * 예를 들어서 
		 * 1 -> 소수x
		 * 2 -> 소수
		 * 3 -> 소수
		 * 5 -> 소수
		 * 7 -> 소수
		 * 
		 * 입력   출력
		 * 10 -> 2 + 3 + 5 + 7 = 17
		 * 13 -> 2 + 3 + 5 + 7 + 11 + 13 = 41
		 */
		//5의 약수의 개수
//		int count = 0;
//		for(int i = 1; i <= 5; i++) {
//			
//			if(5 % i == 0) {
//				count++;
//			}
//		}
//		
//		if(count == 2) {
//			//5는 소수입니다.
//		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int num = scan.nextInt();
		
		
		int count = 0; //네, 0을 마지막에 카운트 0을 했다.
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			
			//1의 약수개수, 2의 약수개수, ..... num까지 약수의 개수
			for(int j = 1; j <= i; j++) {
				//요기서 약수 개수를 구해보면
				if(i % j == 0) {
					count++;
				}
			} //
			
			if(count == 2) {
				//i는 소수라고 할 수 있음.
				sum += i;
			}
			
			count = 0;
		}
		
		System.out.println(num + "까지 소수의 합:" + sum);
		
		
		
		
		
		
		
		
		
		
	}
}
