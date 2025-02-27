package quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		//1. 1~입력받은수 까지의 6의 배수의 합
		//제어변수 -> 조건 -> 제어변수
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//				
//		int sum1 = 0; //합계
//		int i = 1;
//		while(i <= num) {
//			
//			if(i % 6 == 0) {
//				sum1 += i; //6의 배수일때만 합계
//			}
//			i++;
//		}
//		System.out.println("6배수의 합:" + sum1);
	
		
		//2. 1~100까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 개수
		
		int cnt = 0; //개수 셀 변수
		int a = 1;
		while(a <= 100 ) {
			
			if(a % 4 == 0 && a % 8 != 0) {
				cnt++; //
			}
			a++;
		}
		System.out.println("1~100까지 4, 8의 개수:" + cnt);
		
		System.out.println("--------------------------------------");
		
		//3. 50-100까지 정수들의 합
		int sum2 = 0;
		int n = 50;
		while(n <= 100) {
			sum2 += n; //50~100까지 합
			n++;
		}
		System.out.println("결과:" + sum2);
		System.out.println("--------------------------------------");
		
		//4. 1000의 약수들의 개수
		int k = 1;
		int count = 0;
		while(k <= 1000) {
			//k가 1000의 약수인지 아닌지 확인함
			if(1000 % k == 0) {
				count++;
			}
			k++;
		}
		System.out.println("1000의 약수의 개수:" + count);
		
		
		
		
	}
}
