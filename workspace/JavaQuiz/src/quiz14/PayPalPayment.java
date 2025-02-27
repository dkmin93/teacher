package quiz14;

public class PayPalPayment implements Payment {
	
	private String pin = "1234";
	
	@Override
	public void pay(int amount) {
		System.out.println("paypal로 " + amount + "원을 결제합니다.");
	}

	@Override
	public boolean validatePaymentDetails(String details) {
		return pin.equals(details);
	}

}
