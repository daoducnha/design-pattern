package observer_pattern.display;

import observer_pattern.DisplayElement;
import observer_pattern.Observer;
import observer_pattern.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float currentPressure = 29.9f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {

    }

}
