package patterns.observer;

public class WeatherData {
	CurrentConditionsDisplay currentConditionDisplay;
	StatisticsDisplay statisticsDisplay;
	ForecastDisplay forecastDisplay;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		currentConditionDisplay = new CurrentConditionsDisplay();
		statisticsDisplay = new StatisticsDisplay();
		forecastDisplay = new ForecastDisplay();
	}
	public void measurementsChanged() {
		float temperature = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		currentConditionDisplay.update(temperature, humidity, pressure);
		statisticsDisplay.update(temperature, humidity, pressure);
		forecastDisplay.update(temperature, humidity, pressure);
	}
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
