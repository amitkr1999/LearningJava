package com.company.intermediate.Encapsulation;

public class CarApp {
/*Defination
    Process of wrapping the data and method in a single unit is called encapsulation. Encapsulation is hiding information
     To achive encapsulation
     1. Declare data member(Variable ) as private
     Creating private variable in the car class as number of seats etc.
     2 Defining  getter() and setter() method in car class define getprice and set price.
     3. To access define main method and calling constructor of Dodgechallenger and creating object and passing the value to an object redDodge challenger and after then printing the value*/


    public static void main(String[] args) {

        //calling constructor of DodgeChallenger and creating object and  passing the value to an object redDodgeChallenger
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte)3, (short)450, (short)717, (short)7700, 40000, 15000, true);
        System.out.println(redDodgeChallenger.getCarName() + "'s price is $" + redDodgeChallenger.getPrice());
        redDodgeChallenger.setPrice(-35000);
        System.out.println(redDodgeChallenger.getCarName() + "'s new price is $" + redDodgeChallenger.getPrice());
        redDodgeChallenger.startTheEngine();
        System.out.println("The car has " + redDodgeChallenger.getMileage() + "miles");
        redDodgeChallenger.drive(0);
        System.out.println("After driving the car, it has " + redDodgeChallenger.getMileage() + "miles");

        System.out.println("----------------------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte)1, (short)225, (short)717, (short)3500, 40000, 15000, false);
        System.out.println(blackToyotaSupra.getCarName() + "'s price is $" + blackToyotaSupra.getPrice());
        blackToyotaSupra.setPrice(32000);
        System.out.println(blackToyotaSupra.getCarName() + "'s new price is $" + blackToyotaSupra.getPrice());
        blackToyotaSupra.startTheEngine();
        System.out.println("The car has " + blackToyotaSupra.getMileage() + "miles");
        blackToyotaSupra.drive(200);
        System.out.println("After driving the car, it has " + blackToyotaSupra.getMileage() + "miles");
    }

}
