package patterns.state4;

public class LockedState implements TurnstileState {

	public void coin(Turnstile t) {
		System.out.print("Coin is inserted\n");
		t.setState(new UnlockedState());
		
	}

	public void push(Turnstile t) {
		System.out.print("Pushed, didn't get through\n");
		
	}
	
	public void print(Turnstile t) {
		System.out.print("Locked\n");

	}

}
