package com.anjoriarts.lld.parkinglot.vehicle;

import java.util.concurrent.ThreadLocalRandom;

public class VehicleFactory {
    public static Vehicle getInstance(VehicleType type){

        int number = ThreadLocalRandom.current().nextInt(10000, 100000);
        String license = type.name() + number;
        Vehicle vehicle;

        switch(type.name().toLowerCase()){
            case "car":
                vehicle = new Car(license);
                break;
            case "bike":
                vehicle = new Bike(license);
                break;

            default:
                throw new RuntimeException("No valid vehicle given");
            
        }

        return vehicle;
    }
}
