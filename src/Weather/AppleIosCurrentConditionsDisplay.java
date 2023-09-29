package Weather;

// This is an observer that displays the current weather conditions
public class AppleIosCurrentConditionsDisplay implements Observable {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Current conditions: " + temperature + " degrees and " + humidity + "% humidity");
    }
}
