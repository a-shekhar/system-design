package com.anjoriarts.designpatterns.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private double temperature, humidity, pressure;
    private WeatherData data;

    public CurrentConditionsDisplay(WeatherData data){
        this.data = data;
    }

    @Override
    public void update() {
        this.temperature = data.getTemperature();
        this.humidity = data.getHumidity();
        this.pressure = data.getPressure();

        display();
    }

    @Override
    public void display(){
        System.out.println("CurrentConditionsDisplay notified:: " + 
        " Temperature: " + temperature + ", Humidity: " + humidity + ", Pressure: " + pressure);
    }
    
}
