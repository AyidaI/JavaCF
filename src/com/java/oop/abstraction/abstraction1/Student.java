package com.java.oop.abstraction.abstraction1;

public abstract class Student {
String name;
int id;

public  Student(String name, int id){
    this.name=name;
    this.id=id;
}
    public abstract void study();

    //method with implementation
public void sleep(){
    System.out.println("Student sleeping");
}
public abstract int test1();

}


