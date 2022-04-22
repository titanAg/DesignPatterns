package patterns.state1;

public class Vibration implements MobileAlertState {
	public void alert(AlertStateContext ctx) {
		System.out.print("vibration");
	}

}
