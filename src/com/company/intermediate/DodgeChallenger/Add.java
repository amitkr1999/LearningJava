package com.company.intermediate.DodgeChallenger;

import java.util.Scanner;

 class Add {
   int a, b;
  void getdata() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number");
       a = sc.nextInt();
       System.out.println("Enter second number");
       b = sc.nextInt();
       getdata();
   }
    void putdata(){
       System.out.println("sum of two number is" + (a+b));
   }
    public static void main(String[] args) {
       Add aa = new Add();
       aa.getdata();
       aa.putdata();

    }
}
