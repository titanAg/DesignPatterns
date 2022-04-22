package patterns.state4;

public class TurnstileTest {

	public static void main(String[] args) {
		Turnstile turn = new Turnstile();
		
		turn.printStatus();
		turn.insertCoin();
		turn.printStatus();
		turn.push();
		turn.printStatus();
		turn.push();
		turn.printStatus();
		turn.insertCoin();
		turn.printStatus();
		turn.insertCoin();
		turn.printStatus();
	}

}
