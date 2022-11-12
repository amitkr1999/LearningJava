package com.company.intermediate.Encapsulation;

public class TriangleArea {
    private int base;
    private int height;
     public void setarea(int base, int height){
         this.base= base;
         this.height= height;
         int area = (base*height)/2;
         System.out.println(area);
     }


}
