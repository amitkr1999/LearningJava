package com.company.intermediate.Polymorphism;
// Define class and extends athlete class
class FootballPlayer extends Athlete {

    private int completions;
    private int passingYards;
    // Define Method getBodyType with return type String
    public FootballPlayer(String name, String nickname, int yearOfBorn, String team, int gamesPlayed, int completions, int passingYards) {
        //Super class constructor
        super(name, nickname, yearOfBorn, team, gamesPlayed);
        this.completions = completions;
        this.passingYards = passingYards;
    }

    @Override
    // Define Method getBio with return type void
    public void getBio() {
        //Super class constructor
        super.getBio();
        System.out.println("Completions: " + completions);
        System.out.println("Passing yards: " + passingYards);
    }

    @Override
    // Define Method getBodyType with return type String
    public String getBodyType() {
        return "Big muscles and great endurance.";
    }
    // Define Method increaseCompletions with return type void
    public void increaseCompletions(int completions) {
        this.completions += completions;
    }
    // Define Method increasePassingYards with return type void
    public void increasePassingYards(int passingYards) {
        this.passingYards += passingYards;
    }
}
