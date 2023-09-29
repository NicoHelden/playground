package Weather;

// Main application to test the Observer Pattern
public class WeatherStation {
    public static void main(String[] args) {
        // Create subject
        WeatherData weatherData = new WeatherData();

        // Create observers
        AppleIOSDisplay currentDisplay = new AppleIOSDisplay();
        RTBFTvChannelForecastDisplay forecastDisplay = new RTBFTvChannelForecastDisplay();

        // Register observers with the subject
        weatherData.addObserver(currentDisplay);
        weatherData.addObserver(forecastDisplay);

        // Simulate new weather measurements
        weatherData.setMeasurements(25, 65);
        weatherData.setMeasurements(20, 70);
    }
}
