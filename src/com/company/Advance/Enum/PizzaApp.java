package com.company.Advance.Enum;

public class PizzaApp {
  public static void main(String[] args) {

      Pizza PizzaOrder = new Pizza("MARGARETA", PizzaSize.MEDIUM);
      System.out.println("I ordered the following pizza:");
      System.out.println("Name " + PizzaOrder.getName());
      System.out.println("Size " +PizzaOrder.getPizzaSize());
      System.out.println("Price " +PizzaOrder.getPrice());
  }


}
