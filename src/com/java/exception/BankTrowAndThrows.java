package com.java.exception;

import java.io.IOException;

public class BankTrowAndThrows {
     static int amount;
     static int balance;


   BankTrowAndThrows(int balance, int amount) {
       this.balance = balance;
       this.amount = amount;


    }
    public static void withdraw(int amount) throws IOException{
       if(balance < amount){
           throw new IOException("Insufficient Balance");
       }else{
           balance-=amount;
       }
    }
    public static void deposit(int amount) throws IOException{
       balance+=amount;
    }
    public static void trasferMaoney(int amount) throws IOException{
       withdraw(amount);
        System.out.println("Amount $ "+amount+" was transferred  successfully");
    }
    public static void payBill(int amount) throws IOException{
           withdraw(amount);
           System.out.println("Amount $ "+amount+" paid the bill  successfully");
       }

    public static void main(String[] args) throws IOException{
        deposit(55);
        payBill(10);
        System.out.println(balance);
    }
}
