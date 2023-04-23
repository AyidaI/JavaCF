package com.java.oop.abstraction.abstraction1;

public  class CampusStudent extends Student{

//constructor
public CampusStudent(String name, int id){
    super(name, id);  //or can provide name "Masha", id "342"

}

    //implementation for studing method
    public void study(){
        System.out.println("Studying in Campus");
    }
    //non-abstract class cannot have abstract method
    //public abstract void drink();

    public void sleep(){
        System.out.println("Campus student is sleeping for 5 hrs");

    }
    public int test1(){
        System.out.println("Campus Student taking test");
      return 3;
    }
    public void playTableTennis(){
        System.out.println("Table Tennis");
    }
}
