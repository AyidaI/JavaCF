package com.java.methods;

public class Animal {
    //Instance variable, instance variable define/belong the object
    String color;
    String name;
    int age;
    int energyLevel;
    int run;

    String gender="Female";

    public void eat(){
        energyLevel=100;   //local value
        System.out.println("Energy level "+energyLevel+" after eating"); //assign
        System.out.println(name+" is eating");
    }
    //create a method that will print put all properties of every animal
    public void printInfo(){
        System.out.println(name+" - "+age+" - "+color+" - "+gender);
    }
    public void run(){

        energyLevel-=20;
        System.out.println("After running energy Level of "+name+" is "+energyLevel);



    }
}
