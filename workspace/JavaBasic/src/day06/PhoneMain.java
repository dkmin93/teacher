package day06;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		
		
		
		
		Phone phone = new Phone(); //생성자
		phone.info();
		
		
		Phone red = new Phone("red"); //1kb
		red.info();
		
		Phone black = new Phone("black", 30000);
		black.info();
		
		Phone white = new Phone("갤럭시 노트10+부서진", "white", 600000);
		white.info();
		

		
		
		
		
		
	}
}
