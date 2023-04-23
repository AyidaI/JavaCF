package com.java.oop.inheritance1;

public class Zoo {
    public static void main(String[] args) {

    Animal animal1 = new Animal() {
        @Override
        public void speak() {

        }
    };
        System.out.println(animal1.color);

        WildAnimal wild=new WildAnimal();
        System.out.println(wild.color);

        Lion lion=new Lion();
        lion.color="Brownish";
        System.out.println(lion.color);

        DomesticAnimal domestic=new DomesticAnimal();
        System.out.println(domestic.color);
        Cat cat = new Cat();
        System.out.println(cat.color);

        animal1.eat();
        wild.eat();
        domestic.eat();
        lion.eat();
        cat.eat();

        animal1.name="Father";
        System.out.println(animal1.name);
        System.out.println(wild.name);

        animal1.eat();
        lion.name="Simba";
        lion.eat();

        System.out.println("============");

        animal1.speak();
        wild.speak();
        lion.speak();

        System.out.println(domestic.hasToy);
        System.out.println(cat.hasToy);
       domestic.play();
       cat.play();

        domestic.name="Tom";
        cat.name="Jerry";
        System.out.println(cat.name);

        domestic.play();
        cat.play();

}}
