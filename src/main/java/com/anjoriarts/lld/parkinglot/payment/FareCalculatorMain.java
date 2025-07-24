package com.anjoriarts.lld.parkinglot.payment;

import java.time.ZonedDateTime;

public class FareCalculatorMain {

    private FareCalculator fareCalc;

    public void setCalculateStrategy(FareCalculator fareCalc){
        this.fareCalc = fareCalc;
    }

    public double calculateFare(FareType type, ZonedDateTime entryTime){
        return fareCalc.calculateFee(type, entryTime);
    }
}
