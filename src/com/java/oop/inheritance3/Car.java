package com.java.oop.inheritance3;

import javax.sound.midi.Soundbank;

public class Car extends Vehicle{
    String engineType;
    String model;

    public Car(){
        super("Camry", 2021, "Toyota");
    }


// *extends Vehicle
//    //  variables:
//    //    model;
//    //    engineType;
//    //  Methods:
//    //    Override move(); --> Car is moving
//    //    Override accelerate(); --> return Integer and calls model from parent class

    @Override
    public void move() {
        System.out.println("Car is Moving");
        super.move();   //calling from parent
    }
    @Override
    protected Vehicle accelerate() {
        System.out.println("Car accelerate");
        // return (Car)(new Vehicle("",5,""));
        System.out.println(super.model);  //calls model from parent class
        this.model=super.model;
        System.out.println(model);
        return new Vehicle("", 5, "");
    }



    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("Nissan",2023, "Altima");
        vehicle.move();

        Object i = vehicle.accelerate();
        System.out.println(i);
        System.out.println("++++++++++++");

        //Canot casting
        String str = (String)vehicle.accelerate().toString();
        str=str.concat("==========");
        System.out.println(str);
        Integer i1 = (Integer) vehicle.accelerate();
        System.out.println(i1*5);
        int i2=(Integer) vehicle.accelerate();
        System.out.println(i2*11);

        Car car=new Car();
        car.move();

        System.out.println("===============");
        car.accelerate();

        Vehicle v= car.accelerate();
        System.out.println(v);
        System.out.println(v.model);
        System.out.println(v.year);

//        Car car1=(Car)car.accelerate();
//        System.out.println(car1.year);
    }
}
