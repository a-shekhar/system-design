package com.anjoriarts.lld.parkinglot.payment;

import java.time.ZonedDateTime;

public interface  ParkingTime {

    int calculateHours(ZonedDateTime entryDateTime);

    int calculateDays(ZonedDateTime entryDateTime);
}
