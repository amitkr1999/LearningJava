package com.company.Advance.Enum;

public class Pizza {
         private PizzaName PizzaName;
         private PizzaSize PizzaSize;
         private double price;


    public Pizza(PizzaName pizzaName, PizzaSize pizzaSize) {
        this.PizzaName = PizzaName;
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

    public PizzaName getName() {
        return PizzaName;
    }

    public PizzaSize getPizzaSize() {
        return PizzaSize;
    }

    public double getPrice() {
        return price;
    }
}
