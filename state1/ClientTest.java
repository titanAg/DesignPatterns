package patterns.state1;

public class ClientTest {
	public static void main(String[] args) {
		MobileAlertState state1 =  new Vibration();
		MobileAlertState state2 =  new Silent();
		AlertStateContext phone = new AlertStateContext(state1);
		
		getMessage(phone);
		
		phone.setState(state2);
		getMessage(phone);
		
		phone.setState(state1);
		getMessage(phone);
		
		phone.setState(state2);
		getMessage(phone);
	}
	
	public static void getMessage(AlertStateContext phone) {
		System.out.print("alert. the phone is in ");
		phone.alert();
		System.out.print(" state\n");
	}
}
