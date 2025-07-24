package com.anjoriarts.lld.parkinglot.vehicle;

public class Vehicle {
    protected String licenseNo;
    protected VehicleType type;

    public Vehicle(String licenseNo, VehicleType type){
        this.licenseNo = licenseNo;
        this.type = type;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public VehicleType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Vehicle [licenseNo=" + licenseNo + ", type=" + type + "]";
    }

}
