package com.company.Advance.Enum;

public class Pizza {
         private String name;
         private PizzaSize PizzaSize;
         private double price;


    public Pizza(String name, PizzaSize pizzaSize) {
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

    public PizzaSize getPizzaSize() {
        return PizzaSize;
    }

    public double getPrice() {
        return price;
    }
}
