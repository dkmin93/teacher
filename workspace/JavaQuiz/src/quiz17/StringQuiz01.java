package quiz17;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. id문자열을 입력 받습니다.
		 * 2. 아이디는 공백을 포함해서 받을 수 있습니다. nextLine()
		 * 3. 공백을 제외하고, 5글자 미만이면, 다시 입력받습니다.
		 * 4. 5글자 이상이라면 "id 등록" 을 출력하고 종료
		 */

		Scanner scan = new Scanner(System.in);
		

		while(true) {
			String id = scan.nextLine();
			id = id.replace(" ", "");
		
			if(id.length() >= 5) {
				System.out.println(id + "등록");
				break;
			} else {
				System.out.println("아이디는 5글자 이상입니다");
			}
			
			
		}
		

		
		
		
		
	}
}
