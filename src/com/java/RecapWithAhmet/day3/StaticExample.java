package com.java.RecapWithAhmet.day3;

public class StaticExample {
   public  static int money=10000;  //static means shareable
   public int weight = 210;


    public static void speak(){
        System.out.println("Ahmet is speaking");

    }
    public void run(){
        System.out.println("Ahmet is running");
    }
    public void withdrawMoney(){
        money-=200;
        System.out.println("Money in my account");
    }
    static{
        //this will no-Matter what execute first
//        System.out.println("Hey I am "+"Static block "+"Please"+
//                " Let me go first");
        System.out.println("WELCOME TO AMERICA");

    }
    {
        //this will come after static block
        System.out.println("Hey I am a "+"instance block");
    }
}
