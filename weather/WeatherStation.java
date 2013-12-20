package weather;

public class WeatherStation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		HeatIndexDisplay heatDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMesurements(80, 65, 30.4f);
		weatherData.setMesurements(77, 43, 54.4f);
	}
}
