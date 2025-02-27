package day06;

public class Phone {
	
	String model;
	int price;
	String color;
	
	//생성자 - 클래스명과 대/소문자 동일, 반환유형은 x
	//보통 초기값을 지정하는 작업을 합니다.
	Phone() {
		System.out.println("폰 생성자 호출 됨!!!");
		model = "늑대의유혹 가로본능";
		price = 10000;
		color = "검정색";
	}
	//생성자는 중복해서 여러개 만들 수 있음
	//단, 매개변수의 종류, 개수, 순서가 달라야 합니다.
	Phone(String pColor) {
		model = "좐지현의 애니콜";
		price = 20000;
		color = pColor;
	}
	
	Phone(String pColor, int pPrice) {
		model = "M 모토로라가 부활했습니다";
		price = pPrice;
		color = pColor;
	}

	//멤버변수의 개수 만큼 값을 받아서, 초기화 해주는 생성자.
	Phone(String pModel, String pColor, int pPrice) {
		//멤버변수를 초기화 해주고, main에서 여러분 휴대폰으로 생성
		model = pModel;
		color = pColor;
		price = pPrice;
	}
	
	
	
	
	
	void info() {
		System.out.println("---휴대폰 정보---");
		System.out.println("모델:" + model);
		System.out.println("가격:" + price);
		System.out.println("색상:" + color);
	}
	
	
	
	
	
}
