class WeatherForecast {
    private String day;
    private double temperature;
    private String conditions;

    // Constructor
    public WeatherForecast(String day, double temperature, String conditions) {
        this.day = day;
        this.temperature = temperature;
        this.conditions = conditions;
    }

    // Getter methods
    public String getDay() {
        return day;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getConditions() {
        return conditions;
    }

    // Display method to print weather forecast details
    public void displayForecast() {
        System.out.println("Day: " + day + ", Temperature: " + temperature + "°C, Conditions: " + conditions);
    }
}

public class TourWeatherForecast {
    public static void main(String[] args) {
        // Array of WeatherForecast objects representing the weather for each tour day
        WeatherForecast[] forecasts = {
                new WeatherForecast("Monday", 25.0, "Sunny"),
                new WeatherForecast("Tuesday", 22.5, "Cloudy"),
                new WeatherForecast("Wednesday", 20.0, "Rainy"),
                new WeatherForecast("Thursday", 23.0, "Sunny"),
                new WeatherForecast("Friday", 24.5, "Partly Cloudy")
        };

        System.out.println("Weather Forecast for the Tour:");
        for (WeatherForecast forecast : forecasts) {
            forecast.displayForecast();
        }
    }
}
