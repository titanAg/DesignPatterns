package patterns.state1;

class AlertStateContext {
	private MobileAlertState currentState;

	public AlertStateContext(MobileAlertState state) {
		currentState = state;
	}

	public void setState(MobileAlertState state) {
		currentState = state;
	}

	public void alert() {
		currentState.alert(this);
	}
}
