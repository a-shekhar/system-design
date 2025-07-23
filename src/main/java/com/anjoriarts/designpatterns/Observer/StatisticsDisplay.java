package com.anjoriarts.designpatterns.observer;

public class StatisticsDisplay implements Observer, DisplayElement{

    double maxTemperature = Integer.MIN_VALUE;
    double minTemperature = Integer.MAX_VALUE;
    double maxHumidity = Integer.MIN_VALUE;
    double minHumidity = Integer.MAX_VALUE;
    double maxPressure = Integer.MIN_VALUE;
    double minPressure = Integer.MAX_VALUE;

    private double temperature, humidity, pressure;
    private WeatherData data;



    public StatisticsDisplay(WeatherData data){
        this.data = data;
    }
    
    @Override
    public void update() {

        this.temperature = data.getTemperature();
        this.humidity = data.getHumidity();
        this.pressure = data.getPressure();

        if(temperature > maxTemperature){
            maxTemperature = temperature;
        }

        if(temperature < minTemperature){
            minTemperature = temperature;
        }

        if (humidity > maxHumidity) {
            maxHumidity = humidity;
        }

        if (humidity < minHumidity) {
            minHumidity = humidity;
        }

        if (pressure > maxPressure) {
            maxPressure = pressure;
        }
        if (pressure < minPressure) {
            minPressure = pressure;
        }

        display();
    }

    @Override
    public void display(){
        System.out.println("StatisticsDisplay notified:: " + 
        " Max Temperature: " + maxTemperature + ", Min Temperature: " + minTemperature +
        ", Max Humidity: " + maxHumidity + ", Min Humidity: " + minHumidity +
        ", Max Pressure: " + maxPressure + ", Min Pressure: " + minPressure);
    }
    
}
