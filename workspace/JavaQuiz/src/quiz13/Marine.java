package quiz13;

public class Marine extends Unit {
	
	public static int attack = 6; 
	public static int armor = 0;
	
	public Marine() {
		this.hp = 60;
	}
	
	@Override
	public void location() {
		System.out.println("현재 위치:" + x + ", " + y);
	}

	@Override
	public void move(int x, int y) {
		System.out.println("위치 이동:" + x + ", " + y);
	}

	public void stimPack() {
		attack += 1;
	}
	
	
	
	
	
}
