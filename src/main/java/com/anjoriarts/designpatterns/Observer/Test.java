package com.anjoriarts.designpatterns.observer;

public class Test {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        Observer currentDisplay = new CurrentConditionsDisplay(data);
        data.registerObserver(currentDisplay);
        data.setMeasurements(38.0, 27.2, 15.4);

        Observer statsDisplay = new StatisticsDisplay(data);
        data.registerObserver(statsDisplay);
        data.setMeasurements(40.0, 27, 12);

        data.removeObserver(currentDisplay);
        data.setMeasurements(41., 27, 12);
    }
}
