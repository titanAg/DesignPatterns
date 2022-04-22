package patterns.state2;

public class Parcel {
	State state;

	public Parcel() {
	}

	public void setState(State state) {
		this.state = state;
	}

	public void previousState() {
		if (state == State.IN_TRANSIT)
			state = State.ORDERED;
		else if (state == State.DELIVERED)
			state = State.IN_TRANSIT;
		else if (state == State.RECEIVED)
			state = State.DELIVERED;
	}

	public void nextState() {
		if (state == State.ORDERED)
			state = State.IN_TRANSIT;
		else if (state == State.IN_TRANSIT)
			state = State.DELIVERED;
		else if (state == State.DELIVERED)
			state = State.RECEIVED;
	}

	public void printStatus() {
		System.out.println("The parcel is " + state);
	}
}
