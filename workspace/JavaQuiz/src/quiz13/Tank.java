package quiz13;

public class Tank extends Unit {
	
	private boolean changeMode = false;
	
	public Tank() {
		this.hp = 100;
	}
	
	@Override
	public void location() {
		//.....
	}

	@Override
	public void move(int x, int y) {
		//.....
	}

	public void chageMode() {
		changeMode = !changeMode;
	}
	
	
	
	
	
}
