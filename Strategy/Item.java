package strategy;
public class Item {

	private String upcCode;
	private String description;
	private double price;
	
	public Item(String upc, String description, double price){
		this.upcCode = upc;
		this.price = price;
	}
	public String getUpcCode() {
		return upcCode;
	}
	public double getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}

	
}