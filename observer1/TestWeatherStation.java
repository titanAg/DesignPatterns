package patterns.observer1;

import patterns.observer.WeatherData;

public class TestWeatherStation {
	public static void main(String[] args) {
		WeatherData wd1 = new WeatherData();
		
		wd1.setMeasurements(20, 57, 29);
		wd1.setMeasurements(18, 60, 29);
		wd1.setMeasurements(22, 65, 27);
		
		
	}
}
