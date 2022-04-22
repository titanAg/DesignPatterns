package patterns.state2;

public class ParcelTest {
	public static void main(String[] args) {
		Parcel parcel = new Parcel();
		parcel.setState(State.ORDERED);
		
		parcel.printStatus();		
		parcel.nextState();
		
		parcel.printStatus();		
		parcel.nextState();
		
		parcel.printStatus();		
		parcel.nextState();
	
		parcel.printStatus();		
		parcel.nextState();
		
		parcel.printStatus();		
		parcel.nextState();
	}
}
