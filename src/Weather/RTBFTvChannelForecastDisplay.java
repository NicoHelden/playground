package Weather;

// Second Observer that displays weather forecast
public class RTBFTvChannelForecastDisplay implements Observable {
    @Override
    public void update(float temperature, float humidity) {
        // Code to forecast weather
        System.out.println("Displaying weather forecast...");
    }
}
