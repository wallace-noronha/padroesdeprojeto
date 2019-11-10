package br.com.padroesdeprojeto.observer.view;

import br.com.padroesdeprojeto.observer.model.DisplayElement;
import br.com.padroesdeprojeto.observer.model.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditions implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditions(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "Cº graus " + humidity +"% humidity");
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
