package com.company.intermediate.Polymorphism;

import java.util.Random;
// Define class and extends athlete class
class BasketballPlayer extends Athlete {
   // Define Private variable
    private double freeThrowPercentage;
    private double pointsPerGame;
// Define class Constructor with parameter name, nickname, yearOfBorn, team, numberOfCompetitions
    public BasketballPlayer(String name, String nickname, int yearOfBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
         //Super class constructor
        super(name, nickname, yearOfBorn, team, gamesPlayed);
        // Assinging the value of parameter to local variable
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
    }
    //Define method freeThrow with return type void
    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        if((randomNumberGenerator.nextDouble() * 100) > freeThrowPercentage) {
            System.out.println(super.getName() + " failed to score free throw.");
        } else {
            System.out.println(super.getName() + " scored free throw.");
        }
    }
     //is use because two method is called
    @Override
    // Define Method getBio with return type Void
    public void getBio() {
        //constroctor of super class
        super.getBio();
        System.out.println("Free throw percentage: " + freeThrowPercentage);
        System.out.println("Points per game: " + pointsPerGame);
    }
// overrideing compete method in my subclass
    @Override
    // Define Method compete with return type Void
    public void compete() {
        //inside the method calling super class
        super.compete();
        freeThrow();
    }

    @Override
    //Define method getBodyType
    public String getBodyType() {
        return "Tall and lean muscle.";
    }
    //Define method getBodyType and passing parameter with freeThrowPercentage
    public void setFreeThrowPercentage(double freeThrowPercentage) {
        this.freeThrowPercentage = freeThrowPercentage;
    }
    //Define method getBodyType and passing parameter with pointPerGame and Assigning the value of parameter to local variable
    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }
}
