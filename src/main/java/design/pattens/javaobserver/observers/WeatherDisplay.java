package design.pattens.javaobserver.observers;

import design.pattens.javaobserver.subject.WeatherData;
import design.pattens.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class WeatherDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;

    @Override
    public void display() {
        System.out.println("Current weather is " + weatherData.getWeather().toString());
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            this.weatherData = (WeatherData) o;
            display();
        }
    }
}
