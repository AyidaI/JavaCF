package com.java.arraylist;

/*
1. create a computer class under AL package
2. Have instance fields of: brand, price, color, screensize
3. create one constructor to initialize all instance variables
4. Create test case:
store 4 computer objects an AL
show properties of each computer from list
 */
public class Computer {
    //instance variable
    String brand;
    double price;
    String color;
    double screenSize;


    //constructor
    public Computer(String brand, double price, String color, double screenSize){
//initialize
        this.brand=brand;
        this.price=price;
        this.color=color;
        this.screenSize=screenSize;

    }
    public String toString(){
        return "Computer{"+brand+" - "+
                price+" - "+color+" - "+screenSize+"}";
    }



}
