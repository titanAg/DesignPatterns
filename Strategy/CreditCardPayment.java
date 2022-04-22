package strategy;

import java.text.DecimalFormat;

public class CreditCardPayment implements PaymentMethod {

	private String name;
	private String cardNumber;
	private String cvv;
	private String expiryDate;
	
	public CreditCardPayment(String nm, String ccNum, String cvv, String expiryDate){
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.expiryDate = expiryDate;
	}
	@Override
	public void pay(double amount) {
		DecimalFormat money = new DecimalFormat("$0.00");
		System.out.println(money.format(amount) + " paid with credit card");
	}

}
