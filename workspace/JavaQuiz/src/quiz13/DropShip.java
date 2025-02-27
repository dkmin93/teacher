package quiz13;

public class DropShip extends Unit {

	private Unit[] arr = new Unit[8];
	private int index = 0;
	
	@Override
	public void location() {
		//...
	}

	@Override
	public void move(int x, int y) {
		//...
	}

	
	public void ride(Unit unit) {
		
		if( unit instanceof Marine && index <= 7 ) {
			arr[index] = unit;
			index++;
		} else if(unit instanceof Tank && index <= 4) {
			arr[index] = unit;
			index+=4;
		} else {
			System.out.println("수송선에 자리가 부족합니다");
		}
		
	}
	
	
	
	
	
}

