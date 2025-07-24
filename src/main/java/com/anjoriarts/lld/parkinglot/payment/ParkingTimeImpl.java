package com.anjoriarts.lld.parkinglot.payment;

import java.time.Duration;
import java.time.ZonedDateTime;

public class ParkingTimeImpl implements ParkingTime{

    @Override
    public int calculateHours(ZonedDateTime entryDateTime) {
        Duration duration = Duration.between(entryDateTime, ZonedDateTime.now());
        long totalMinutes = duration.toMinutes();
        long totalHours = (totalMinutes + 59) / 60;  // 59 ensures ceiling behavior
        return (int) totalHours;
    }

    @Override
    public int calculateDays(ZonedDateTime entryDateTime) {
        Duration duration = Duration.between(entryDateTime, ZonedDateTime.now());
        long totalMinutes = duration.toMinutes();
        double daysFloat = totalMinutes / (60.0 * 24);  // get actual fractional days
        long roundedDays = (long) Math.ceil(daysFloat);  // always round up
        return (int) roundedDays;
    }
    
}
