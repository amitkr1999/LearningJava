package com.company.intermediate.Polymorphism;
//Define class and extends athlete class implements swimming
public class Swimmer extends Athlete implements Swimming {
    // Define Private variable
    private int finaPoints;
    // Define Class Constructor with parameter name, nickname, yearOfBorn, team, numberOfCompetitions
    public Swimmer(String name, String nickname, int yearOfBorn, String team, int numberOfCompetitions, int finaPoints) {
        //Super class constructor
        super(name, nickname, yearOfBorn, team, numberOfCompetitions);
        this.finaPoints = finaPoints;
    }

    @Override
    // Define Method getBodyType with return type String
    public String getBodyType() {
        return "Lean muscle, long torso and flexible ankles.";
    }

    @Override
    // Define Method getBio with return type Void
    public void getBio() {
        //Super class constructor
        super.getBio();
        System.out.println("FINA points: " + finaPoints);
    }

    @Override
    // Define Method freestyle with return type Void
    public void freestyle() {
        System.out.println("Swimming freestyle very fast.");
    }

    @Override
    // Define Method freestyle with return type Void
    public void freestyle(int distance) {
        System.out.println("Swimming " + distance + "m freestyle very fast.");
    }

    @Override
    // Define Method compete with return type Void
    public void compete() {
        super.compete();
        freestyle();
    }
}
