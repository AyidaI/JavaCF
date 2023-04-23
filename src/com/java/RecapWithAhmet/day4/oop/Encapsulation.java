package com.java.RecapWithAhmet.day4.oop;

public class Encapsulation {
    public static void main(String[] args) {
        EncapsulationPractice encapsulationPractice=new EncapsulationPractice();
        encapsulationPractice.setCreditCard(45454545);
        System.out.println(encapsulationPractice.getCreditCard());
        encapsulationPractice.setAge(100);
        System.out.println(encapsulationPractice.getAge());
        encapsulationPractice.setName("Burak");
        System.out.println(encapsulationPractice.getName());
    }
}