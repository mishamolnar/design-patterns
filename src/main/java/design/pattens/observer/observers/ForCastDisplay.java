package design.pattens.observer.observers;

import design.pattens.observer.DisplayElement;
import design.pattens.observer.Observer;
import design.pattens.observer.Subject;
import design.pattens.observer.WeatherProjection;

public class ForCastDisplay implements Observer, DisplayElement {
    private WeatherProjection weatherProjection;
    private Subject weatherData;

    public ForCastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Today will be " + (weatherProjection.getPressure() > 30 ? "rain" : " be dry"));
    }

    @Override
    public void update(WeatherProjection weatherProjection) {
        this.weatherProjection = weatherProjection;
        display();
    }
}
