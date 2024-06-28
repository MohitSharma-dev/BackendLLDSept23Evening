package Observer;

public class WeatherStation {

	public static void main(String[] args) {
		// created a new subject
		WeatherData weatherData = new WeatherData();
		AIWeatherData weatherData1 = new AIWeatherData();
		// created new subscribers

		// API call : provider to be used
		// Name provider : factory : Object
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData1);
		currentDisplay.changeSubject(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		// this is a bad one !
//		currentDisplay.update();
//		statisticsDisplay.update();
//		forecastDisplay.update();


		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println();
		weatherData.setMeasurements(82, 70, 29.2f);
		System.out.println();
		weatherData.setMeasurements(78, 90, 29.2f);
		System.out.println();

		currentDisplay.deregister();
		weatherData.setMeasurements(62, 90, 28.1f);
		System.out.println();
		currentDisplay.registerToGetUpdates();
		weatherData.setMeasurements(99, 90, 28.1f);
		System.out.println();
	}
}
