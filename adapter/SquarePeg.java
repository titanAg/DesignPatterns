package patterns.adapter;

public class SquarePeg implements Adaptee {
	private double side;
	
	public SquarePeg(double side) {
		this.side = side;
	}
	
	@Override
	public double getAlteredSide() {
		// TODO Auto-generated method stub
		return  side/Math.sqrt(2);
	}
	
	public double getSide() {
		// TODO Auto-generated method stub
		return  side;
	}
}
