package patterns.state3;

public class DeliveredState implements ParcelState {
	
	public void next(Parcel p) {
		p.setState(new ReceivedState());

	}

	public void prev(Parcel p) {
		p.setState(new InTransitState());
	}

	public void print(Parcel p) {
		System.out.print("DELIVERED\n");
	}
}
