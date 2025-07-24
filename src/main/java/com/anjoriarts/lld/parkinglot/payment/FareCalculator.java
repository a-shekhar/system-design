package com.anjoriarts.lld.parkinglot.payment;

import java.time.ZonedDateTime;

public interface FareCalculator {

    double calculateFee(FareType type, ZonedDateTime entryDateTime);    
}
