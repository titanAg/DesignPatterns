package patterns.state3;

public class OrderedState implements ParcelState {
	
	
	public void next(Parcel p) {
		p.setState(new InTransitState());
	}
	
	public void prev(Parcel p) {
		p.setState(new OrderedState());
	}
	
	public void print(Parcel p) {
		System.out.print("ORDERED\n");
	}
}
