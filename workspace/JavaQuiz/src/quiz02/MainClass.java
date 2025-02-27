package quiz02;

public class MainClass {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		tv.power(); //켬
		tv.changeChannel(5);
		tv.info();
		tv.power(); //끔
	}
}
