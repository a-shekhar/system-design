package com.anjoriarts.designpatterns.Observer;

public class Test {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        Observer observer1 = new CurrentConditionsDisplay();
        data.registerObserver(observer1);
        data.setMeasurements(38.0, 27.2, 15.4);

        Observer observer2 = new StatisticsDisplay();
        data.registerObserver(observer2);
        data.setMeasurements(40.0, 27, 12);

        data.removeObserver(observer1);
        data.setMeasurements(41., 27, 12);
    }
}
