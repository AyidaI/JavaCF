package com.java.object;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal= new Animal();  //object
        System.out.println(animal);


        animal.name="Simba";
        animal.color="brown";
        animal.age=2;
        System.out.println(animal.name+" "+animal.age+" "+animal.color);

        Animal cat = new Animal();
        cat.age=3;
        cat.color="Yellow";
        cat.name="Leo";
        System.out.println(cat.gender);

        cat.gender="Male"; //reassign
        System.out.println(cat.gender);

        //create a method that will print out all properties

        cat.printInfo();
        animal.printInfo();
        System.out.println("=====================");

        //new object
        Animal dog = new Animal();
        System.out.println(dog.energyLevel);  // null is eating
        dog.eat();  //feed a dog
        System.out.println(dog.energyLevel);  // 100
        System.out.println("?? Cat's Energy ?? "+ cat.energyLevel); //0


        //Create a run method
        //when an animal runs
        //it will use 20% of energy
        //implement the logic and show leftover energy
        //include name of the method to let user know who is running
        cat.run();
        cat.run();
        cat.run();

        cat.eat();
    }


}
