package com.anjoriarts.lld.parkinglot.vehicle;

public class Bike extends Vehicle{
    
    public Bike(String licenseNo){
        super(licenseNo, VehicleType.BIKE);
    }

    @Override
    public String toString() {
        return "Bike [licenseNo=" + licenseNo + ", type=" + type.name() + "]";
    }
}
