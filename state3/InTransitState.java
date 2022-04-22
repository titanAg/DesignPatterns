package patterns.state3;

public class InTransitState implements ParcelState {
	
	public void next(Parcel p) {
		p.setState(new DeliveredState());
	}
	
	public void prev(Parcel p) {
		p.setState(new OrderedState());
	}
	
	public void print(Parcel p) {
		System.out.print("IN TRANSIT\n");
	}
}
