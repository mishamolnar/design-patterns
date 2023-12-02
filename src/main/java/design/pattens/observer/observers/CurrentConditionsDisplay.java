package design.pattens.observer.observers;

import design.pattens.observer.DisplayElement;
import design.pattens.observer.Observer;
import design.pattens.observer.Subject;
import design.pattens.observer.WeatherProjection;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private WeatherProjection weatherProjection;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Parameters are " + weatherProjection.toString());
    }

    @Override
    public void update(WeatherProjection newWeatherProjection) {
        this.weatherProjection = newWeatherProjection;
        display();
    }
}
