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

    private ParkingSlot findFirstFreeSlot(List<ParkingSlot> slots, Vehicle vehicle){
        ParkingSlot slotAvailable = null;
        ZonedDateTime entryDateTime = ZonedDateTime.now().minusDays(2);
        for(ParkingSlot slot: slots){
            if(!slot.isOccupied()){
                slot.setOccupied(true);
                slot.setEntryTime(entryDateTime);
                slot.setParkedVehicle(vehicle);
                slotAvailable = slot;
                break;
            }
        }

        return slotAvailable;
    }

    public ParkingSlot assignParkingLot(Vehicle vehicle, VehicleType type){
        ParkingSlot slot = null;
        if(type == VehicleType.BIKE){
            slot = this.findFirstFreeSlot(bikeSlots, vehicle);
        }else if(type == VehicleType.CAR){
            slot = this.findFirstFreeSlot(carSlots, vehicle);
        } 
        if (slot == null){
         throw new IllegalStateException("No free slot available");
        }
        return slot;
    }

    private ParkingSlot releaseSlot(ParkingSlot slot, List<ParkingSlot> slotList){
        for(ParkingSlot slotIterator: slotList){
            if(slotIterator.getParkingSlotNo() == slot.getParkingSlotNo()){
                slot.setOccupied(false);
                slot.setParkedVehicle(null);
                slot.setEntryTime(null);
                break;
            }
        }
        return slot;
    } 

    public String releaseParkingSlot(ParkingSlot slot, VehicleType type){
        if(type == VehicleType.BIKE){
            slot = this.releaseSlot(slot, bikeSlots);
        }else if(type == VehicleType.CAR){
            slot = this.releaseSlot(slot, carSlots);
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