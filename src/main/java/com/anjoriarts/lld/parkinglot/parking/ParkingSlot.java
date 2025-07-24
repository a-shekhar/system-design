package com.anjoriarts.lld.parkinglot.parking;

import java.time.ZonedDateTime;

import com.anjoriarts.lld.parkinglot.vehicle.Vehicle;
import com.anjoriarts.lld.parkinglot.vehicle.VehicleType;

public class ParkingSlot {
    private int parkingSlotNo;
    private VehicleType supportedType;
    private boolean occupied;
    private Vehicle parkedVehicle;
    private ZonedDateTime entryTime;
    

    public ParkingSlot(int parkingSlotNo, VehicleType supportedType){
        this.parkingSlotNo = parkingSlotNo;
        this.supportedType = supportedType;
    }

    public int getParkingSlotNo() {
        return parkingSlotNo;
    }

    public VehicleType getSupportedType() {
        return supportedType;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public ZonedDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(ZonedDateTime entryTime) {
        this.entryTime = entryTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParkingSlot{");
        sb.append("parkingSlotNo=").append(parkingSlotNo);
        sb.append(", supportedType=").append(supportedType);
        sb.append(", occupied=").append(occupied);
        sb.append(", parkedVehicle=").append(parkedVehicle);
        sb.append(", entryTime=").append(entryTime);
        sb.append('}');
        return sb.toString();
    }

 



}
