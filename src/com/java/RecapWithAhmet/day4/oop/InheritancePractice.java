package com.java.RecapWithAhmet.day4.oop;

public class InheritancePractice {

    public static void main(String[] args) {

        Porsche porsche=new Porsche();
        porsche.price=300_000;
        System.out.println(porsche.price);
        System.out.println(porsche.tiers);

        Bugatti bugatti=new Bugatti();
        bugatti.price=500_000;
        System.out.println(bugatti.price);
        System.out.println(bugatti.tiers);



    }
}
