package strategy;

import java.text.DecimalFormat;

public class PaypalPayment implements PaymentMethod {

	private String emailId;
	private String password;
	
	public PaypalPayment(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	
	@Override
	public void pay(double amount) {
		DecimalFormat money = new DecimalFormat("$0.00");
		System.out.println(money.format(amount) + " paid using Paypal.");
	}

}
