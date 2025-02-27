package quiz01;

import java.util.Scanner;

public class Quiz18 {
	
	public static void main(String[] args) {
		//백준 10952
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(a == 0 && b == 0) break;
			
			System.out.println(a + b);
		}
		
		scan.close();
		
		
		
		
		
		
	}
}
