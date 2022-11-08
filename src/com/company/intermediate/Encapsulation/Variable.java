package com.company.intermediate.Encapsulation;

public class Variable {
    private int value;

    public void setvalue(int x){
        value= x;
    }
    public int getvalue(){

        return value;
    }

    public static void main(String[] args) {
        Variable value = new Variable();
        value.setvalue(100);
        System.out.println(value.getvalue());
    }
}
