package day01;

public class VariableScope {

	public static void main(String[] args) {
		
		//int num1 = 10;
		//int num2 = 20;
		int num1 = 10, num2 = 20; //같은 타입변수라면 ,나열 할 수 있음. 
		int num4 = 40;
		
		//변수는 해당 중괄호 안에서만 유효합니다.
		if(true) {
			int num3 = 30;
			num4 = 400; //값의 변경
		}
		
		int num3 = 40;
		System.out.println(num3);
		System.out.println(num4);
		
		
		
	}
}
