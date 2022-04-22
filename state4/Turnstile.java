package patterns.state4;

public class Turnstile {
	private TurnstileState currentState;
	public Turnstile() {
		currentState = new LockedState();
	}
	
	public void setState(TurnstileState state) {
		currentState = state; 
	}
	
	public void insertCoin() {
		currentState.coin(this);
	}
	
	public void push() {
		currentState.push(this);
	}
	
	public void printStatus() {
		currentState.print(this);
	}
}
