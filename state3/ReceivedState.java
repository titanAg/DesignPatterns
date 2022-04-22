package patterns.state3;

public class ReceivedState implements ParcelState {
	
	
	
	public void next(Parcel p) {
		p.setState(new ReceivedState());
	}
	
	public void prev(Parcel p) {
		p.setState(new DeliveredState());
	}
	
	public void print(Parcel p) {
		System.out.print("RECEIVED\n");
	}
}
