package com.java.oop.inheritance1;

public class Cat extends DomesticAnimal{
    String name;

    @Override
    public void play(){
        System.out.println(this.name+" is playing");
    }
  //  void jump(){
//        System.out.println("Cat is Jumping");

    int jump() {
        System.out.println("Cat is Jumping");
        return 4;
    }
    //commenting out private hunt method below
    //since, it was having wider access modifier in the parent class
    //here it is not compiling we made it private


   // public void hunt(){ // can't inherited at child because parent is private access modifier
    //    System.out.println("Cat is Hunting");
        public Cat hunt(){
            return new Cat();
        }
    }

