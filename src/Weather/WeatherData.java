package Weather;

import java.util.ArrayList;
import java.util.List;

// This is the "subject" we want to observe
public class WeatherData {
    // List to hold all observers
    private List<Observable> observers;

    // Weather data
    private float temperature;
    private float humidity;


    // Constructor initializes the list of observers
    public WeatherData() {
        observers = new ArrayList<>();
    }


    public void addObserver(Observable observer) {
        observers.add(observer);
    }
    public void removeObserver(Observable observer) {
        observers.remove(observer);
    }


    // Method to set new weather measurements and then call measurementsChanged();
    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }


    // Notify all registered observers when data changes
    public void notifyObservers() {
        for (Observable observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}
