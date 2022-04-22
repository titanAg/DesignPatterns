package patterns.observer1;

public class CurrentConditionsDisplay implements Observer, Display {
	private float temperature;
	private float humidity;
	private float pressure;
	 Subject weatherData;

	CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public void display() {
		System.out.println("Current conditions: " + temperature + "C degrees, " + humidity + "% humidity and "
				+ pressure + " in pressure");
	}
	
	public void removeObserver(Subject o) {
		weatherData.removeObserver((Observer) o);
	}
}
