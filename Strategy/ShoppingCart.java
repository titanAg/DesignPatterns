package strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;
	 PaymentMethod payment;
	
	public ShoppingCart(){
		this.items=new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public double calculateTotal(){
		double sum = 0;
		for(Item item : items){
			sum += item.getPrice();
		}
		return sum;
	}
	public void setPayment(PaymentMethod payment){
		this.payment = payment;
	}
	public void processPayment(){
		double amount = calculateTotal();
		payment.pay(amount);
	}
}