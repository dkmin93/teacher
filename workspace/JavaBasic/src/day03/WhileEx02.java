package day03;

public class WhileEx02 {

	public static void main(String[] args) {
		
		//1~50까지의 수 중에서 짝수들의 합계 구하라.
		
		int a = 1;
		int sum = 0; //합계를 누적할 변수
		
		while(a <= 50) {			
			
			if(a % 2 == 0) { //짝수
				sum += a;
			}
			a++;
		}
		
		System.out.println("1~50까지의 합:" + sum);
		
		
		
		
		
		
		
		
		
		
	}
}
