package com.company.intermediate.inharitance;

    public class SingleInheritance {
      String playername = "Dhoni";
      int Age = 40;
      int matchplayed = 1425;
      int runs = 12459;

    public  void input() {
        System.out.println("Player Name" + playername + " Age " + Age + "Match Played " + matchplayed + " Runs " + runs);
    }
    class player extends SingleInheritance{

    }
        public static void main(String[] args) {
            SingleInheritance singleInheritance =new SingleInheritance();
           singleInheritance.input();
            System.out.println(singleInheritance);
        }
    }
