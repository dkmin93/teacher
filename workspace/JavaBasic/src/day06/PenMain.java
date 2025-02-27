package day06;

public class PenMain {

	public static void main(String[] args) {
		
		//Pen을 쓰고 싶으면 객체로 생성을 해야합니다.
		//펜의 속성에 접근 할 때 . 연산자를 씁니다.
		Pen black = new Pen(); //생성자
		black.ink = "검정";
		black.price = 1000;
		black.company = "모나미";
		
		black.write();
		String r = black.info();		
		System.out.println(r);
		
		System.out.println("-------");
		
		Pen red = new Pen();
		red.ink = "빨강";
		red.price = 2000;
		red.company = "하이테크";
		
		red.write();
		String r2 = red.info();
		System.out.println(r2);
			
		
	}
}
