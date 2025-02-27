package quiz20;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 로또 번호 자동 생성기
		 * Set을 이용해서 6개의 랜덤한 로또 번호를 만들어내는 프로그램 코드를 작성해보세요.
		 * 
		 * 1~45번 
		 * 
		 */
		
		Set<Integer> set = new HashSet<>();
		Random ran = new Random();
		
		//1~45
		//ran.nextInt(45) + 1 
		while(true) {
			set.add(ran.nextInt(45) + 1 );
			if(set.size() == 6) break;
		}
		
		System.out.println( set.toString() );
		
		
		
		
		
		
		
		
		
		
		
	}
}
