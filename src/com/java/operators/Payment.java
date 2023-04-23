package com.java.operators;
//Tv 465 dollars-> each month paying -> 50 ->find last moth's payment
public class Payment {
    public static void main(String[] args) {
        int tv$=465;
        int eachMonth$=50;

       int leftOfOver$= tv$ % eachMonth$;
        System.out.println(leftOfOver$);
        System.out.println(tv$ / eachMonth$);

    }
}
