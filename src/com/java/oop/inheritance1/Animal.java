package com.java.oop.inheritance1;

public abstract class Animal {
    //instance variable
String color = "Orange";
String name;
int age;

public void eat(){
    System.out.println(name+" is eating");
}
public void sleep(){
        System.out.println("Animal is sleeping");

}

    public abstract void speak();
}

