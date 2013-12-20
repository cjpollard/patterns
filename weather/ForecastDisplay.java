package weather;

import java.util.Observer;
import java.util.Observable;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private float currentPressure = 29.92f;
	@SuppressWarnings("unused")
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}
	
	public void update(Observable observable, Object args) {
		WeatherData weatherData = (WeatherData) observable;
		if(observable instanceof WeatherData) {
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}
	
	public void display() {
		System.out.println("Forecast...");
	}

}
