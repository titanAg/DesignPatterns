package patterns.state4;

public class UnlockedState implements TurnstileState {

	public void coin(Turnstile t) {
		System.out.print("Coin is inserted. ???\n");	
	}

	public void push(Turnstile t) {
		System.out.print("Pushed, passed through.\n");
		t.setState(new LockedState());
	}

	public void print(Turnstile t) {
		System.out.print("Unlocked\n");

	}
}
