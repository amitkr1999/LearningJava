package com.company.intermediate.Polymorphism;
 //Define a abstract class Athlete
public abstract class Athlete {
// Define Private variables
    private String name;
    private String nickname;
    private int yearOfBorn;
    private String team;
    private int numberOfCompetitions;

  // Define Class Constructor with parameter name, nickname, yearOfBorn, team, numberOfCompetitions

    public Athlete(String name, String nickname, int yearOfBorn, String team, int numberOfCompetitions) {
        // Assinging the value of parameter to local variable
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.numberOfCompetitions = numberOfCompetitions;
    }
   // Define Method getName with return type String
    public String getName() {
        return name;
    }
    // Define Method getBio with return type Void

    public void getBio() {
        System.out.println(name + " (" + nickname + ")");
        System.out.println("Born in " + yearOfBorn);
        System.out.println("Last team is " + team + " and took part in " + numberOfCompetitions + " competitions");
    }
      //Define  Method compete with return type void
     // printing name of the player and incrementing the number of competition
    public void compete() {
        System.out.println(name + " took part in a competition.");
        numberOfCompetitions++;
    }
      //Define getTeam method with return type String and returning name of the team
    public String getTeam() {
        return team;
    }
    //Define setTeam method with parameter team as a void method
    public void setTeam(String team) {
        this.team = team;
    }
  //Define abstract blank method
    public abstract String getBodyType();
}
