package com.company.intermediate.Polymorphism;
//interface is just like a class in java, it contains abstract methods. A class implements interface and inheriting the abstract methods of the interface.
public interface Swimming {
    //Method overloading
    void freestyle();

    void freestyle(int distance);
}
// Interface is just like a class in java,
// It contains abstract methods in java
// I have define freestyle() and freestyle(int distance)
// A class implement interface and inheriting the abstract methods of the interface
// This interface is implemented in Swimmer.java class and above two methods are override and defined its body