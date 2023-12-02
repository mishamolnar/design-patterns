package design.pattens.observer;

public interface WeatherProjection {

    float getTemperature();

    void setTemperature(float temperature);

    float getHumidity();

    void setHumidity(float humidity);

     float getPressure();

     void setPressure(float pressure);
}
