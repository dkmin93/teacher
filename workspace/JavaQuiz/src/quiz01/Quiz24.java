package quiz01;

import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {
		
		//백준 27866 - 문자와문자열
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//		int a = scan.nextInt();
//		
//		System.out.println(  str.charAt( a - 1) );
		
		//백준 9086 - 문자열 
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		
//		for(int i = 1; i <= a; i++) {
//			String str = scan.next();
//			System.out.println("" + str.charAt(0) + str.charAt( str.length()-1 ) );
//		}
		
		//백준 11720 - 숫자의 합 
		//힌트 - 
//		System.out.println( (int)'1'); //49 - 48
//		System.out.println( (int)'9'); //57 - 48
		
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String b = scan.next();

		int sum = 0;
		for(int i = 0; i < b.length(); i++) { //문자열반복
			 sum += b.charAt(i) - 48;
		}
		
		System.out.println(sum);
		
		
		
		//백준 1152 - 단어의 개수 
		
		
	}
}
