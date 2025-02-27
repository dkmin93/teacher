package quiz17;

public class StringQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 문자열 거꾸로 뒤집기
		 * 
		 * 매개변수로 전달받은 문자열을, 거꾸로 뒤집어서 반환하는 메서드를 생성하세요
		 * 
		 * reverse(String) 
		 * 입력 -> abcde
		 * 반환 -> edcba
		 */
		
		System.out.println(  reverse("ABCDE")  );
		System.out.println(  reverse("hello world")  );
		
	}
	
	public static String reverse(String word) {
		
		String str = "";
		for(int i = word.length() - 1; i >= 0; i-- ) {
			str += word.charAt(i);
		}
		
		return str;
	}
	
	
	
}
