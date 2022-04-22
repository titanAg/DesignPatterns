package patterns.adapter;

public class TriangularPeg implements Adaptee {
	private double side;
	
	public TriangularPeg(double side) {
		this.side = side;
	}
	
	@Override
	public double getAlteredSide() {
		// TODO Auto-generated method stub
		return side/Math.sqrt(3);
	}
	public double getSide() {
		// TODO Auto-generated method stub
		return  side;
	}
}
