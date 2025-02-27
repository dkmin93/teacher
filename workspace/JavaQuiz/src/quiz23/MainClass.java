package quiz23;

public class MainClass {

	public static void main(String[] args) {
		
		//2개의 객체, 스레드 2개 (독립적으로 각각 실행)
		
		Video v1 = new Video();
		Download v2 = new Download();
			
		Thread thread1 = new Thread(v1);
		Thread thread2 = new Thread(v2);
		thread1.start();
		thread2.start();
		
		
	}
}
