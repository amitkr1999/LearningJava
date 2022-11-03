package com.company.intermediate.classesandobject;

import java.util.Scanner;

public class add {
   int a, b;
  private void getdata() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number");
       a = sc.nextInt();
       System.out.println("Enter second number");
       b = sc.nextInt();
   }
   private void putdata(){
       System.out.println("sum of two number is" + (a+b));
   }
    public static void main(String[] args) {
       add aa = new add();
       aa.getdata();
       aa.putdata();

    }
}
