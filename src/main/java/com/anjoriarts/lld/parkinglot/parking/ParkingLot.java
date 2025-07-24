package com.anjoriarts.lld.parkinglot.parking;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import com.anjoriarts.lld.parkinglot.vehicle.Vehicle;
import com.anjoriarts.lld.parkinglot.vehicle.VehicleType;

public class ParkingLot{

    private List<ParkingSlot> bikeSlots = new ArrayList<>();
    private List<ParkingSlot> carSlots = new ArrayList<>();

    public ParkingLot(int bikeSlotsNo, int carSlotsNo){
        for(int i = 1; i <= bikeSlotsNo; i++){
            bikeSlots.add(new ParkingSlot(i, VehicleType.BIKE));
        }

        for(int i = 1; i <= carSlotsNo; i++){
            carSlots.add(new ParkingSlot(i, VehicleType.CAR));
        }
    }

    public List<ParkingSlot> getBikeSlots() {
        return bikeSlots;
    }

    public List<ParkingSlot> getCarSlots() {
        return carSlots;
    }

    public ParkingSlot assignParkingLot(Vehicle vehicle, VehicleType type){
        ParkingSlot slot = null;
        ZonedDateTime entryDateTime = ZonedDateTime.now().minusDays(2);
        if(type == VehicleType.CAR){
            for(ParkingSlot carSlot: carSlots){
                if(!carSlot.isOccupied()){
                    carSlot.setOccupied(true);
                    carSlot.setEntryTime(entryDateTime);
                    carSlot.setParkedVehicle(vehicle);
                    slot = carSlot;
                    break;
                }
            }
        } else if(type == VehicleType.BIKE){
            for(ParkingSlot bikeSlot: bikeSlots){
                if(!bikeSlot.isOccupied()){
                    bikeSlot.setOccupied(true);
                    bikeSlot.setEntryTime(entryDateTime);
                    bikeSlot.setParkedVehicle(vehicle);
                    slot = bikeSlot;
                    break;
                }
            }
        }

        return slot;
    }

    public String releasePakingSlot(ParkingSlot slot, VehicleType type){
        if(type == VehicleType.BIKE){
            for(ParkingSlot bikeSlot: bikeSlots){
                if(bikeSlot.getParkingSlotNo() == slot.getParkingSlotNo()){
                    bikeSlot.setOccupied(false);
                    bikeSlot.setParkedVehicle(null);
                    bikeSlot.setEntryTime(null);
                    break;
                }
            }
        }else if(type == VehicleType.CAR){
            for(ParkingSlot carSlot: carSlots){
                if(carSlot.getParkingSlotNo() == slot.getParkingSlotNo()){
                    carSlot.setOccupied(false);
                    carSlot.setParkedVehicle(null);
                    carSlot.setEntryTime(null);
                    break;
                }
            }
        }

        return "Released parking lot " + slot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParkingLot{");
        sb.append("bikeSlots=").append(bikeSlots);
        sb.append(", carSlots=").append(carSlots);
        sb.append('}');
        return sb.toString();
    }


}