package encapsulation.exercises;

/**
 TODO:
 1. Create a private field temperatureInCelsius (double).
 2. Add getter and setter for it (no unrealistic values like -273).
 3. Add a method getFahrenheit() that converts Celsius to Fahrenheit.
 4. Add a method getKelvin() that converts Celsius to Kelvin.
 */
public class Temperature
{
    // your code here
    private double temperatureInCelsius;

    public Temperature() {
    }

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        if (temperatureInCelsius >= -273) {
            this.temperatureInCelsius = temperatureInCelsius;
        }
    }

    public double getFahrenheit() {
        return (temperatureInCelsius * 9/5) + 32;
        // formula from https://www.google.com/search?q=get+fahrenheit+from+celsius&oq=get+fahrenheir&gs_lcrp=EgZjaHJvbWUqCAgBEAAYDRgeMgYIABBFGDkyCAgBEAAYDRgeMgoIAhAAGAUYDRgeMgoIAxAAGAUYDRgeMgoIBBAAGAUYDRgeMgoIBRAAGAUYDRgeMgoIBhAAGAUYDRgeMgoIBxAAGAUYDRgeMgoICBAAGAUYDRgeMgoICRAAGAUYDRge0gEINzI5MGowajSoAgCwAgA&sourceid=chrome&ie=UTF-8
    }

    public double getKelvin() {
        return temperatureInCelsius + 273.15;
        // formula from https://www.google.com/search?q=get+kelvin+from+celsius&oq=get+kelvin+from+celsius&gs_lcrp=EgZjaHJvbWUqCAgBEAAYDRgeMgYIABBFGDkyCAgBEAAYDRgeMgoIAhAAGAUYDRgeMgoIAxAAGAUYDRgeMgoIBBAAGAUYDRgeMgoIBRAAGAUYDRgeMgoIBhAAGAUYDRgeMgoIBxAAGAUYDRgeMgoICBAAGAUYDRgeMgoICRAAGAUYDRge0gEINzI5MGowajSoAgCwAgA&sourceid=chrome&ie=UTF-8
    }
}
