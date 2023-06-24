package com.company.Advance.Collection.ArrayList;

import java.util.Vector;

public class VectorApp {

    public static void main(String[] args) {
        Vector<String> toDoVector = new Vector<>(2, 3);
        System.out.println("Initial capacity of the vector: " + toDoVector.capacity());

        toDoVector.add("Cleaning the garden");
        toDoVector.add("Painting the walls");
        toDoVector.add("Taking the dog for a walk");

        System.out.println("Capacity of the vector after adding 3 elements: " + toDoVector.capacity());
        System.out.println("Size of the vector after adding 3 elements: " + toDoVector.size());

        System.out.println("The first element of the vector is: " + toDoVector.firstElement());
        System.out.println("The last element of the vector is: " + toDoVector.lastElement());

    }
}
// Difference between array list and link list?
// An array is a collection of elements of a similar data type and a linked list is a collection of objects known as a node where node consists of two parts, i.e., data and address.