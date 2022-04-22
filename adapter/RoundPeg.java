package patterns.adapter;

public class RoundPeg implements RoundShape {
	private double radius;

	public RoundPeg() {
	}

	public RoundPeg(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
}
