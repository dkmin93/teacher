package quiz01;

public class Quiz02 {

	public static void main(String[] args) {
		
		//1. 랜덤한정수 1~100이 주어질 때, 이 값이 5의 배수인지 확인하고, 출력하세요.
		int r = (int)(Math.random() * 100) + 1; //1~100
		
		System.out.println("랜덤수: " + r);
		System.out.println(  r % 5 == 0 ? "5의 배수" : "5의 배수가 아닙니다"    );
		
		//2. 랜덤한정수 -5~5가 주어질 때, 언제나 이값을 절대값으로 출력해주세요.
		
		int ran = (int)(Math.random() * 11) - 5;
		System.out.println(ran);
		
		System.out.println("랜덤수:" + ran);
		System.out.println("절대값:"  + ( ran < 0 ? -ran : ran ) );
		
		System.out.println("-----------------------------------");
		/*
		사과 x개를 상자에 담을 때 필요한 상자의 개수를 구하려고 합니다.
		한 상자에는 최대 10개의 사과가 들어 갈 수 있습니다.

		* 사과의 개수가 1~150개 랜덤하게 주어질 때, 
		필요한 바구니의 개수를 구하는 프로그램을 작성하세요.
		
		힌트 - 나머지와 몫
		딱 나누어 떨어지는 경우 vs 나누어 떨어지지 않는 경우	
		*/
		int apple = (int)(Math.random() * 150 ) + 1;
		int bucket = 10; //상자
		System.out.println("사과의 개수:" + apple);	
		 
		int count = apple % bucket == 0 ? apple / bucket : apple / bucket +1;
		System.out.println("상자의 개수:" + count );
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
