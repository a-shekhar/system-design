package com.anjoriarts.designpatterns.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private double temperature, humidity, pressure;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    @Override
    public void display(){
        System.out.println("CurrentConditionsDisplay notified:: " + 
        " Temparture: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }
    
}
