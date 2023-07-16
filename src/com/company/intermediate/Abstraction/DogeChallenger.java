package com.company.intermediate.Abstraction;

import com.company.intermediate.Encapsulation.Car;

class DodgeChallenger extends Car implements ElectricMode {


    public DodgeChallenger(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
                           int price, int mileage, boolean isDamaged) {
        super("Dodge Challenger", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
    }
//When we have to redefine a method which is already is  parent class it is called method overriding
    @Override
    public void startTheEngine() {
        System.out.println("A Dodge Challenger engine is started.");
    }

    @Override
    public void startTheElectricEngine() {
        System.out.println("Dodge Challenger starts its electric engine.");
    }
}