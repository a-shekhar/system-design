package com.anjoriarts.lld.parkinglot.payment;

import java.time.Duration;
import java.time.ZonedDateTime;

import com.anjoriarts.lld.parkinglot.parking.ParkingSlot;
import com.anjoriarts.lld.parkinglot.vehicle.VehicleType;

public class FeeCalculator {
    public static double calculateFee(FareType fare, ParkingSlot slot){
        double totalFare = 1;
        Duration duration = Duration.between(slot.getEntryTime(), ZonedDateTime.now());
        long totalMinutes = duration.toMinutes();
        System.out.println(fare + " " + slot);

        switch (fare) {
            case FareType.DAILY:
                double daysFloat = totalMinutes / (60.0 * 24);  // get actual fractional days
                long roundedDays = (long) Math.ceil(daysFloat);  // always round up
                if(slot.getParkedVehicle().getType().equals(VehicleType.BIKE)){
                    totalFare = 15 * 24 * roundedDays; // 15 rs per hour
                }else if(slot.getParkedVehicle().getType().equals(VehicleType.CAR)){
                    totalFare = 35 * 24 * roundedDays; // 35 rs per hour
                }
                break;
            case FareType.HOURLY:
                long totalHours = (totalMinutes + 59) / 60;  // 59 ensures ceiling behavior
                if(slot.getParkedVehicle().getType().equals(VehicleType.BIKE)){
                    totalFare = 20 * totalHours; // 20 rs per hour
                }else if(slot.getParkedVehicle().getType().equals(VehicleType.CAR)){
                    totalFare = 40 * totalHours; // 40 rs per hour
                }
                break;
            default:
                throw new AssertionError();
        }

        return totalFare;
    }
}
