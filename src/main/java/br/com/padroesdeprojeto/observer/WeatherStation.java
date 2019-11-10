package br.com.padroesdeprojeto.observer;

import br.com.padroesdeprojeto.observer.model.WeatherData;
import br.com.padroesdeprojeto.observer.view.CurrentConditions;
import br.com.padroesdeprojeto.observer.view.ForecastDisplay;
import br.com.padroesdeprojeto.observer.view.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(90, 89, 40.9f);
        weatherData.setMeasurements(100, 90, 53.9f);

    }

}
