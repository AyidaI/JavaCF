package com.java.oop.inheritance1;

public class DomesticAnimal extends Animal{
    boolean hasToy;
    String name;

    protected void play(){
        System.out.println("Domestic "+name+" is playing");
    }
   // void jump(){
     //   System.out.println("D is Jumping");
   int jump() {
       System.out.println("D is Jumping");
       return 2;
   }
   public DomesticAnimal hunt(){
       System.out.println(" D is Hunting  ");
       return new DomesticAnimal();
    }
  //  private void hunt() {
      //  System.out.println("D is Hunting");
  //  }
    @Override
    public void speak() {

    }
}
