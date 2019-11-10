package br.com.padroesdeprojeto.observer.view;

import br.com.padroesdeprojeto.observer.model.DisplayElement;
import br.com.padroesdeprojeto.observer.model.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float pressure;
    private Observable observable;

    public ForecastDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Forecast display: " + pressure );
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.pressure = weatherData.getPressure();
            display();
        }
    }

}
