package day05;

public class MethodEx01 {
	
	public static void main(String[] args) {
		/*
		 * 1. 함수는 만들고, 사용하는 과정(호출)이 있습니다
		 * 2. 메서드 안에는 메서드를 선언할 수 없습니다.
		 */
	
		//멋진 기능을 하나 만들어야지~ 1부터 10까지 합계
		System.out.println(  sumNum() );

		
		int result = sumNum();
		System.out.println(result);
		
		String str = randomStr();
		System.out.println(str);
		
	} //main
	
	//함수
	static int sumNum() { 
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
	
	//함수
	static String randomStr() {
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		return str; //아직 돌려줄 값이 없다 
	}
	
	
	
	
	
}
