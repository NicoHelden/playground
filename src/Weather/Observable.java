package Weather;

// Observer interface for all concrete observers to implement
public interface Observable {
    // Update method called for observers to update their data
    void update(float temperature, float humidity);
}

