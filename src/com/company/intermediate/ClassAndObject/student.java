package com.company.intermediate.ClassAndObject;

public class student {
    String name;
    int roll_no;
    static class student1{
        String name;
        int roll_no;
        long phone_number;
        String address;

    }
    static class student2{
        String name;
        int roll_no;
        long phone_number;
        String address;

    }

    public static void main(String[] args) {
        student s = new student();
        s.name= "Jhon";
        s.roll_no = 2;
        System.out.println("Student name is " + s.name + " and Roll no is " + s.roll_no );

        student1 s1 = new student1();
        s1.name = "Sam";
        s1.roll_no = 4;
        s1.phone_number = 853497625;
        s1.address = "Haryana";
        System.out.println("Student name is " + s1.name + " and Roll no is " + s1.roll_no + " Phone Number is " + s1.phone_number + " Address is " + s1.address);

        student2 s2 = new student2();
        s2.name = "Mike";
        s2.roll_no = 5;
        s2.phone_number = 853497625;
        s2.address = "Delhi";
        System.out.println("Student name is " + s2.name + " and Roll no is " + s2.roll_no + " Phone Number is " + s2.phone_number + " Address is " + s2.address);

    }
}
