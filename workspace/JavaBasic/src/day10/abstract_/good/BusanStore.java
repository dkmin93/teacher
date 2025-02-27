package day10.abstract_.good;

public class BusanStore extends Store {

	@Override
	public void melon() {
		System.out.println("부산지점의 멜론 100원");
	}

	@Override
	public void orange() {
		System.out.println("부산지점의 오렌지 200원");
	}

	@Override
	public void grape() {
		System.out.println("부산지점의 포도 300원");
	}

	@Override
	public void apple() {
		System.out.println("부산지점의 사과 400원");
		
	}

}
