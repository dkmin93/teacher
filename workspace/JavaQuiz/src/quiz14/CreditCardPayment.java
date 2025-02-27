package quiz14;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println("신용카드 " + amount + "원을 결제합니다.");
	}

	@Override
	public boolean validatePaymentDetails(String details) {
		return details.length() == 16;
	}

}




