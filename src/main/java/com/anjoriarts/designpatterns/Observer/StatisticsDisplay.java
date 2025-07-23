package com.anjoriarts.designpatterns.Observer;

public class StatisticsDisplay implements Observer, DisplayElement{

    double maxTemperature = Integer.MIN_VALUE;
    double minTemperature = Integer.MAX_VALUE;
    double maxHumidity = Integer.MIN_VALUE;
    double minHumidity = Integer.MAX_VALUE;
    double maxPressure = Integer.MIN_VALUE;
    double minPressure = Integer.MAX_VALUE;
    
    @Override
    public void update(double temperature, double humidity, double pressure) {

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
        " Max Temparture: " + maxTemperature + ", Min Temparture: " + minTemperature +
        " Max Humidity: " + maxHumidity + ", Min Humidity: " + minTemperature +
        " Max Pressure: " + maxPressure + ", Min Pressure: " + minPressure);
    }
    
}
