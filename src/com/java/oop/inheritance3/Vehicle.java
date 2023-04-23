package com.java.oop.inheritance3;

public class Vehicle {

   protected String model;
   int year;
  public String brand;
//Methods:
//    //    move(); --> vehicle is moving
//    //    stop(); --> return true, vehicle is stopping
//    //    protected start(); --> return true, vehicle is starting
//    //    default accelerate(); --> return <OneOfObject-Vehhicle_Car>
//    //  Constructor: create a constructor to initiliaze instance variables

   public void move() {
       System.out.println("Vehicle is Moving");
   }
   public boolean stop(){
       System.out.println("Vehicle is stoping");
       return true;

   }
   protected boolean start(){
       System.out.println("Vehicle is starting");
       return true;
   }
   public Vehicle(String model, int year, String brand){
       this.model=model;
       this.year=year;
       this.brand=brand;
   }

   Object accelerate(){
       System.out.println("Vehicle accelerate");
       return 3;
   }

}
