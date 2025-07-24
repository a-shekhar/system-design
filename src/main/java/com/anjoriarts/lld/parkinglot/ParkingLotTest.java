package com.anjoriarts.lld.parkinglot;

import com.anjoriarts.designpatterns.strategy.Payment;
import com.anjoriarts.designpatterns.strategy.UPIPayment;
import com.anjoriarts.lld.parkinglot.parking.ParkingLot;
import com.anjoriarts.lld.parkinglot.parking.ParkingSlot;
import com.anjoriarts.lld.parkinglot.payment.FareType;
import com.anjoriarts.lld.parkinglot.payment.FeeCalculator;
import com.anjoriarts.lld.parkinglot.vehicle.Vehicle;
import com.anjoriarts.lld.parkinglot.vehicle.VehicleFactory;
import com.anjoriarts.lld.parkinglot.vehicle.VehicleType;

public class ParkingLotTest {
    public static void main(String[] args) {
        Vehicle car1 = VehicleFactory.getInstance("Car");
        System.out.println("Car 1 is " + car1);

        Vehicle bike1 = VehicleFactory.getInstance("Bike");
        System.out.println("Bike 1 is " + bike1);

        ParkingLot parkingLot = new ParkingLot(10, 8);
        System.out.println("Bike slots size is " + parkingLot.getBikeSlots().size());
        System.out.println("Car slots size is " + parkingLot.getCarSlots().size());

        ParkingSlot carParkingSlot1 = parkingLot.assignParkingLot(car1, VehicleType.CAR);
        System.out.println(carParkingSlot1);

        ParkingSlot bikeParkingSlot1 = parkingLot.assignParkingLot(bike1,  VehicleType.BIKE);
        System.out.println(bikeParkingSlot1);

        double carFare = FeeCalculator.calculateFee(FareType.HOURLY, carParkingSlot1);
        System.out.println("Fee for car hourly is " + carFare);

        // fare = FeeCalculator.calculateFee(FareType.DAILY, carParkingSlot1);
        // System.out.println("Fee for car daily is " + fare);

        double bikeFare = FeeCalculator.calculateFee(FareType.HOURLY, bikeParkingSlot1);
        System.out.println("Fee for Bike hourly is " + bikeFare);

        // fare = FeeCalculator.calculateFee(FareType.DAILY, bikeParkingSlot1);
        // System.out.println("Fee for Bike daily is " + fare);

        Payment pay = new Payment();
        pay.setPaymentStrategy(new UPIPayment("1234@upi"));
        pay.initiatePayment((int)carFare);
        System.out.println("Fare paid with UPI");

        String release = parkingLot.releasePakingSlot(carParkingSlot1, VehicleType.CAR);
        System.out.println(release);
    }
}
