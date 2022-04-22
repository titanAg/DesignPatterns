package patterns.state4;

public interface TurnstileState {
	public void coin(Turnstile ctx);
	public void push(Turnstile ctx);
	public void print(Turnstile ctx); 
}
