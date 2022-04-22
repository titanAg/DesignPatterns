package patterns.observer1;

public class TestObserver {
	public static void main(String[] args) {
		WeatherData wd1 = new WeatherData();

		CurrentConditionsDisplay wd2 = new CurrentConditionsDisplay(wd1);
		ForecastDisplay wd3 = new ForecastDisplay(wd1);
		StatisticsDisplay wd4 = new StatisticsDisplay(wd1);
		
		System.out.println("Output before first observer removal:");
		wd1.setMeasurements(20, 57, 29);
		System.out.println();
		
		wd1.removeObserver(wd2);
		
		System.out.println("Output after first observer removal:");
		wd1.setMeasurements(20, 57, 29);
		System.out.println();
		
		wd3.removeObserver(wd4);
		
		System.out.println("Output after second observer removal:");
		wd1.setMeasurements(20, 57, 29);
		System.out.println();
	}
}
