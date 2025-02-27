package day06.def;


import java.util.Scanner;



//import day06.abc.Apple; //다른 패키지의 클래스를 사용할 때 import
//import day06.abc.Melon;
import day06.abc.*;


//해당 패키지의 모든 클래스를 한번에 import하려면

public class MainClass {

	public static void main(String[] args) {
		
		Apple a;
		a = new Apple();
		
		//모든 클래스는 데이터타입이 될 수 있다? yes
		
		Melon m = new Melon();
		
		Scanner scan = new Scanner(System.in);
		
		
		int i = 1;
		System.out.println(i); //1
		System.out.println(a); //주소값
		
		
		String str = "sdf";
		
		
		
		
		
	}
}
