package quiz11;

public class Sorceress extends Player {
	//마법사
	
	//1. 생성자 - 이름을 전달받아서, hp = 500, mp = 1000으로 초기화
	public Sorceress(String name) {
		this.name = name;
		this.hp = 500;
		this.mp = 1000;
	}
	//2. 블리자드스킬 - 광역공격기
	//블리자드 스킬은 마나 200을 소모
	//배열안에 들어 있는 모든 객체에 5~15사이의 랜덤한 피해를 한번 발생을 시킵니다.
	//타격당한 플레이어는 체력을 소모해 주면 됩니다.
	//타격당한 플레이어의 이름을 출력해주세요.
	public void blizzard(Player[] players) {
		
		this.mp -= 200; 
		for(Player p : players) {
			
			int ran = (int)(Math.random() * 6) + 10;
			p.hp -= ran; //상대방hp - 데미지
			System.out.println(p.name + "님이" + ran + "피해를 입었습니다");
		}
		
	}
	
	
}
