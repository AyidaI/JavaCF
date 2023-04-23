package com.java.RecapWithAhmet.day5;

public abstract class AbstractPractice1 {

    public AbstractPractice1() {  //constructor

    }

    public static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        AbstractPractice1.name = name;
    }

//    public static void run() {  //you can have regular method
//        System.out.println("Hello I am running");
//    }


    public abstract void dismiss1();  //abstract doesn't have body


    public abstract void speak();

}
