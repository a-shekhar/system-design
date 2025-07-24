package com.anjoriarts.lld.parkinglot.vehicle;

public class Car extends Vehicle{

    public Car(String licenseNo){
        super(licenseNo, VehicleType.CAR);
    }


    @Override
    public String toString() {
        return "Car [licenseNo=" + licenseNo + ", type=" + type.name() + "]";
    }
    
}
