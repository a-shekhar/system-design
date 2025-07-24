package com.anjoriarts.lld.parkinglot.payment;

import java.time.ZonedDateTime;

public class BikeFareCalculator implements FareCalculator{

    private static final int BIKE_HOURLY_RATE = 20;
    private static final int BIKE_DAILY_RATE = 300;
    private ParkingTime parkingTime;

    public BikeFareCalculator(){
        parkingTime = new ParkingTimeImpl();
    }


    @Override
    public double calculateFee(FareType type, ZonedDateTime entryDateTime){
        if(type == FareType.DAILY){
            int days = parkingTime.calculateDays(entryDateTime);
            return BIKE_DAILY_RATE * days;
        } else if(type == FareType.HOURLY){
            int hours = parkingTime.calculateHours(entryDateTime);
            return BIKE_HOURLY_RATE * hours;
        }
        return 999.0;
    }
}
