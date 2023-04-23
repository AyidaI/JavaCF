package com.java.oop.polymorphism;

public class Branch extends ATM{

    @Override
    public void deposit(){
        System.out.println("Deposit at Branch");
    }
    public void loan(){
        System.out.println("Branch loan is up to 500k");
    }
    public void creditCard(){
        System.out.println("Card from Branch");
    }
}
