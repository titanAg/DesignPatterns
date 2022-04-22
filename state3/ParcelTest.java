package patterns.state3;

public class ParcelTest {

	public static void main(String[] args) {
		Parcel parcel = new Parcel();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.print("The parcel is: ");
			parcel.printStatus();		
			parcel.nextState();
		}

	}
}
