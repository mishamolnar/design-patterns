package design.pattens.observer;

import design.pattens.observer.observers.CurrentConditionsDisplay;
import design.pattens.observer.observers.ForCastDisplay;
import design.pattens.observer.projections.WeatherProjectionImpl;
import design.pattens.observer.subjects.WeatherData;

public class ObserverUser {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        ForCastDisplay forecastDisplay = new ForCastDisplay(weatherData);
        weatherData.setMeasurements(new WeatherProjectionImpl(80, 65, 30.4f));
        weatherData.setMeasurements(new WeatherProjectionImpl(82, 70, 29.2f));
        weatherData.setMeasurements(new WeatherProjectionImpl(78, 90, 29.2f));
    }
}
