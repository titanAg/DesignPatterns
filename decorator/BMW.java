package patterns.decorator0;

public class BMW extends Car {
	public BMW() {
		description = "BMW 5 series";
	}

	public double cost() {
		return 63100.00 + super.cost();
	}
}
