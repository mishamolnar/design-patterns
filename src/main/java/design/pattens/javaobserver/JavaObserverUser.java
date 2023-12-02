package design.pattens.javaobserver;

import design.pattens.javaobserver.observers.WeatherDisplay;
import design.pattens.javaobserver.subject.WeatherData;
import design.pattens.observer.projections.WeatherProjectionImpl;

public class JavaObserverUser {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        WeatherDisplay display = new WeatherDisplay();
        weatherData.addObserver(display);
        weatherData.setWeather(new WeatherProjectionImpl(80, 65, 30.4f));
        weatherData.measurementsChanged();
    }
}
