package com.company.intermediate.ClassAndObject;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger dodgeChallenger = new DodgeChallenger();
        dodgeChallenger.getDescription();
        dodgeChallenger.startTheEngine();

        System.out.println("--------------------------------------------------");
        DodgeChallenger anotherdodgeChallenger = new DodgeChallenger();
        anotherdodgeChallenger.getDescription();

    }
}
