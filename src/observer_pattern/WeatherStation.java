package observer_pattern;

import observer_pattern.display.CurrentConditionsDisplay;
import observer_pattern.display.ForecastDisplay;
import observer_pattern.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,65, 30.4f);
        weatherData.setMeasurements(82,70, 29.4f);
        weatherData.setMeasurements(79,75, 31.4f);
    }
}
