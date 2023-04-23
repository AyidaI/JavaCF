package com.java.ifStatement;

public class NestedPractice1 {
    public static void main(String[] args) {
        /*
        check id
        check visa
        check ticket
         */

        boolean id = true, visa=true, ticket = false;
        System.out.println("Checking id now....");

        if(id){
            System.out.println("checking visa now...");
            if(visa){
                System.out.println("Checking ticket now....");
                if(ticket){
                    System.out.println("Enjoy your flight!!!");
                }else {
                    System.out.println("You should have ticket");
                }
            }else {
                System.out.println("You should have visa");
            }

        }else{
            System.out.println("First, you should have valid ID ");
        }
    }
}
