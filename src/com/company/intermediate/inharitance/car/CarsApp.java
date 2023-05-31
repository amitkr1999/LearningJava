package com.company.intermediate.inharitance.car;

import com.company.intermediate.SingleInheritance.SingleInheritance;

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
// Inheritance:- Allow you to define new class from an existing one and inherit its attributes and methods is called inheritance.
//  for example :- the DodgeChallenger class inherit the all  attributes and methods of the car class
//  Syntax :- class Subclass-name extends Superclass-name

// Why use inheritance in java?
//  For Method Overriding
//  For Code Reusability.