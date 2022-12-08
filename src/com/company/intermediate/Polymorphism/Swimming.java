package com.company.intermediate.Polymorphism;
//interface is just like a class in java, it contains abstract methods. A class implements interface and inheriting the abstract methods of the interface.
public interface Swimming {
    //Method overloading
    void freestyle();

    void freestyle(int distance);
}
//interface is just like a class in java, it contains abstract methods.
// for example below I have defined interface as Swimmer with two abstract method
//FreeStyle() and freeStyle( with parameter distance)
// A class implements interface and inheriting the abstract methods of the interface.
//for example this interface is implemented in Swimmer.java class and above two methods are override and defined its body