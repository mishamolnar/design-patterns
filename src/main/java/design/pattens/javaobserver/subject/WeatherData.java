package design.pattens.javaobserver.subject;

import design.pattens.observer.WeatherProjection;

import java.util.Observable;

public class WeatherData extends Observable {
    private WeatherProjection weather;

    public void setWeather(WeatherProjection weatherProjection) {
        this.weather = weatherProjection;
    }

    public WeatherProjection getWeather() {
        return weather;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
}
