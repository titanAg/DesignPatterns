package patterns.state1;

public class Silent implements MobileAlertState {
	public void alert(AlertStateContext ctx) {
		System.out.print("silent");
	}

}