package design.pattens.observer.subjects;

import design.pattens.observer.Observer;
import design.pattens.observer.Subject;
import design.pattens.observer.WeatherProjection;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {
    private Set<Observer> observers;
    private WeatherProjection measurements;

    public WeatherData() {
        observers = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void setMeasurements(WeatherProjection weatherProjection) {
        this.measurements = weatherProjection;
        measurementsChanged();
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this.measurements));
    }

    @Override
    public void measurementsChanged() {
        notifyObservers();
    }
}
