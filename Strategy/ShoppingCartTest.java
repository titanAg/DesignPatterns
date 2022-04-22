package strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShoppingCartTest {

	@Test
	void testProcessPayment() {
		
		ShoppingCart cart = new ShoppingCart();
		Item wallet = new Item("upc 1234", "Herschel Mens Wallet", 19.99);
		Item pack = new Item("upc 5678", "Laptop Backpack Burgundy", 48.99);
		cart.addItem(wallet);
		cart.addItem(pack);
		cart.setPayment(new PaypalPayment("",""));
		cart.processPayment();
		
		cart.setPayment(new CreditCardPayment("","","",""));
		cart.processPayment();
	}

}
