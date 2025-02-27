package day09.static_.method;

public class MainClass {

	public static void main(String[] args) {
		
		//Count c = new Count();
		//c.a = 1;
		
		//static멤버는 객체 생성 없이 접근이 됩니다.
		Count.b = 1;
		Count.method02();
		
		MainClass m = new MainClass();
		m.example();
		
	}
	
	public void example() {
		System.out.println("hello world");
	}
	
	
	
	
}
