package quiz11;

public class Warrior extends Player {
	//전사
	
	//1. 생성자 - 이름을 전달받아서, hp = 1000, mp = 500으로 초기화
	public Warrior(String name) {
		this.name = name;
		this.hp = 1000;
		this.mp = 500;
	}
	//2. 으깨기기술 - 매개변수로 Player를 받습니다.
	//스킬을 사용하면 나의 mp가 100이 소모가 됩니다.
	//마나가 없으면 스킬을 사용할 수 없습니다.
	//타격당한 상대방은 hp가 100이 소모가 됩니다.
	public void powerStrike(Player p) {
		
		if(this.mp < 100) {
			System.out.println("마나가 부족합니다");
			return; 
		}
		
		this.mp -= 100;
		p.hp -= 100;
		System.out.println(this.name + "이 powerStrike를 사용합니다");
		System.out.println(p.name + "이 100의 피해를 받았습니다");
		
	}
	
	
	
	
	
	
}
