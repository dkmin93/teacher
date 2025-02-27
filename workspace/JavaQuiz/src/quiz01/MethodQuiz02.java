package quiz01;

public class MethodQuiz02 {

    static int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
	
	public static void main(String[] args) {
	
		System.out.println( solution(60, 2, 3) );
	}
	
	
	
	
	
	static String java(int a) {
		
		String str = "";
		for(int i = 1; i <= a; i++) {
			//i가 홀수면 "자", 짝수면 "바"
			if(i % 2 == 1) {
				str += "자";
			} else {
				str += "바";
			}
		}
		return str;
	}
	
}
