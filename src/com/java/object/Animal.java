package com.java.object;

public class Animal {
    //instance variables/example
    String name;
    String color;
    int age;
    int energyLevel;

    String gender ="Female";

    public void eat(){
        energyLevel=100;  //reassigning
        System.out.println("Energy level is "+energyLevel+" after eating");
        System.out.println(name+" eating");
    }
    public  void printInfo(){
        System.out.println(name+"-"+age+"-"+color+"-"+gender);
    }
    public void run(){
        energyLevel -=20;
        System.out.println("After running energy level of "+name+ " is "+energyLevel);

    }
}
