package com.anjoriarts.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;


public class WeatherData implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private double temperature, humidity, pressure;


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
       observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update();
        }
    }


    private void measurementsUpdated(){
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity,  double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsUpdated();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
    
}
