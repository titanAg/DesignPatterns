package patterns.adapter;

public class Adapter implements RoundShape {
	Adaptee a;
	public Adapter(Adaptee a) {
		this.a = a;
	}
	
	@Override
	public double getRadius() {
		
		return a.getAlteredSide();
	}
	
}
