package DesignPattern.Weather;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        //You could have statisticDisplay and ForecastDisplay
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.4f);
        weatherData.setMeasurements(79,90,28.4f);

    }
}
