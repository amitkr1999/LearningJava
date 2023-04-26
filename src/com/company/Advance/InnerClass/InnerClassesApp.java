package com.company.Advance.InnerClass;


import com.company.Advance.Enum.PizzaDetails;

class Pizza{
    private String name;
    private PizzaDetails PizzaSize;
    private double price;


    public Pizza(String name, PizzaDetails pizzaSize) {
        this.name = name;
        this.PizzaSize = pizzaSize;
        this.price = calculateprice();
    }

    private double calculateprice() {
        switch (PizzaSize){
            case SMALL :
            default:
                return 5.99;
            case MEDIUM:
                return 7.99;
            case LARGE:
                return 10.99;
        }
    }

    public String getName() {
        return name;
    }

    public PizzaDetails getPizzaSize() {
        return PizzaSize;
    }

    public double getPrice() {
        return price;
    }
}
public class InnerClassesApp {

    public static void main(String[] args) {

        Pizza firstPizza = new Pizza("Margherita", PizzaDetails.MEDIUM);
        System.out.println("Name : " + firstPizza.getName());
        Pizza secondPizza = new Pizza("Margherita" , PizzaDetails.MEDIUM){
            @Override
            public String getName() {
                return "Anonymous";
            }
        };
        System.out.println("Name : " +secondPizza.getName());
    }
}