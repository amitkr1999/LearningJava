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

    public static void main(String[] args) {
        TriangleArea area = new TriangleArea( );
        area.setarea(5, 8);
    }
}
