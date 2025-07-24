package com.anjoriarts.lld.parkinglot.payment;

import java.time.ZonedDateTime;

public class CarFareCalculator implements FareCalculator{

    private static final int CAR_HOURLY_RATE = 40;
    private static final int CAR_DAILY_RATE = 500;
    private ParkingTime parkingTime;

    public CarFareCalculator(){
        parkingTime = new ParkingTimeImpl();
    }


    @Override
    public double calculateFee(FareType type, ZonedDateTime entryDateTime){
        if(type == FareType.DAILY){
            int days = parkingTime.calculateDays(entryDateTime);
            return CAR_DAILY_RATE * days;
        } else if(type == FareType.HOURLY){
            int hours = parkingTime.calculateHours(entryDateTime);
            return CAR_HOURLY_RATE * hours;
        }
        return 999.0;
    }
}
