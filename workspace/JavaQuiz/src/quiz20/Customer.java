package quiz20;

public class Customer {
	//멤버변수
	private String name;
	private int arrivalTime = (int)(Math.random() * 3) + 1;
	//생성자
	public Customer(String name) {
		this.name = name;
	}
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	
	
}
