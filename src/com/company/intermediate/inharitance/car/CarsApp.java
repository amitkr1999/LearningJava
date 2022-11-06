package com.company.intermediate.inharitance.car;

import com.company.intermediate.inharitance.SingleInheritance;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger dodgeChallenger = new DodgeChallenger("red", (byte)3, (short)450, (short)717, (short)7700, 40000, 15000, true);
        dodgeChallenger.getDescription();
        dodgeChallenger.startTheEngine();

        System.out.println("----------------------------------------------");
//        ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte)1, (short)225, (short)717, (short)3500, 40000, 15000, false);
//        blackToyotaSupra.getDescription();
//        blackToyotaSupra.startTheEngine();
        SingleInheritance singleInheritance= new SingleInheritance();
        singleInheritance.input();
//        SingleInheritance.output();
//        p.output();
    }
}
