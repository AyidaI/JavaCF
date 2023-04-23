package com.java.oop.polymorphism;

public class Bank extends Branch{

    public void deposit(){
        System.out.println("Deposit at Bank");
    }
    public void loan(){
        System.out.println("Loan from Bank up to 5M");
    }
    public void openBranch(){
        System.out.println("Bank to Branch opening");
    }
}
