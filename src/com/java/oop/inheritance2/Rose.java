package com.java.oop.inheritance2;

public class Rose extends Flower{

    public Rose(){    //have to be same name is class

        super("Red");

    }

    public Rose(String color, String size, double price){
        super(color,size,price);
    }
    @Override
    public Integer run(int miles){
        System.out.println("Rose is happy to Run");
        return miles+1;
    }

}
