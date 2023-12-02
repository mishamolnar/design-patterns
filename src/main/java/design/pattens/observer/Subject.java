package design.pattens.observer;

public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void setMeasurements(WeatherProjection weatherProjection);
    void notifyObservers();
    void measurementsChanged();
}
