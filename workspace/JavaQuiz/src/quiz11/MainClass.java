package quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w = new Warrior("나는전붕이다");
		
		Warrior w2 = new Warrior("타락파워전사");
		Sorceress s = new Sorceress("drakeDog");
		
		w.powerStrike( w2  );
		w.powerStrike( s  );
		
		w2.info();
		s.info();
		
		
		Player[] arr = {w2, s}; //플레이어 배열에 전사, 마법사 가 들어갈 수 있음
		s.blizzard(arr);
		
		w2.info();
		s.info();
		
		
		
		
		
		
		
		
	}
}
