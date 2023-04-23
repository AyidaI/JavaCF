package com.java.oop.finalPractice;

public class Shirt {

    //instance variable
    final double PRICE=11.99;  //it is changeble but if use Final price need change to PRICE coming use
    String color;
    String size;

    public void sale(){

        System.out.println("Sale");
    }
    final public void dye(){
        System.out.println("Changing color of Shirt");
    }
    final public void dye(String color) {
        System.out.println("Changing color of Shirt to "+color);
    }

    @Override
    protected void finalize() {
        System.out.println("*********");
    }
}
