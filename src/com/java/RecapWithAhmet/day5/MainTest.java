package com.java.RecapWithAhmet.day5;

public class MainTest extends AbstractPractice1{
    public static void main(String[] args) {
     //   AbstractPractice1.run();
        AbstractPractice1.name="Ahmet";
        AbstractPractice1.getName();

    }

    @Override
    public void dismiss1() {
        System.out.println("Ahmet's class will be dismissed at 1pm");

    }

    @Override
    public void speak() {
        System.out.println("Ahmet is speaking");

    }
}
