package com.java.methods;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal1=new Animal();
        System.out.println(animal1);

        System.out.println(animal1.name);
        animal1.name="Simba";
        System.out.println(animal1.name);

        animal1.color="brown";
        animal1.age=2;
        System.out.println(animal1.color);
        System.out.println(animal1.age);

        //create another object
        //initialize all instance variables by using new object
        //print out those new value

        Animal cat = new Animal();

        System.out.println(cat.age);  //0
        cat.age=3;
        cat.name="Ginger";
        cat.color="Orange";

        System.out.println(cat.age);
        System.out.println(cat.name);
        System.out.println(cat.color);

        System.out.println(animal1.gender);

        cat.gender="Male";
        System.out.println(cat.gender);

        System.out.println("+++++++++++++++");

        cat.eat();
        animal1.eat();
        System.out.println("===========");

        //create a method that will print put all properties of every animal

        cat.printInfo();
        animal1.printInfo();

        System.out.println("===========");

        Animal dog = new Animal();
        dog.name="Shar";
        System.out.println(dog.energyLevel); //0

        dog.eat();
        System.out.println(dog.energyLevel); //100
        System.out.println("===========");

        //create a run method, when an animal runs
        //if will use 20 percent of energy
        //implement the logic and show left over energy
        //include name in the method to let user know who is running
        cat.run();
        dog.run();
        cat.run();

        cat.eat();
    }
}
