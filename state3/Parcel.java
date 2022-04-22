package patterns.state3;

public class Parcel {
	private ParcelState currentState;
	public Parcel() {
		currentState = new OrderedState();
	}
	
	public void setState(ParcelState state) {
		currentState = state;
	}
	
	public void previousState() {
		currentState.prev(this);
	}
	
	public void nextState() {
		currentState.next(this);
	}
	
	public void printStatus() {
		currentState.print(this);
	}
}
