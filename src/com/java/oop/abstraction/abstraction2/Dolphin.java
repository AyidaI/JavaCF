package com.java.oop.abstraction.abstraction2;

public class Dolphin implements CanSwim {

    public Integer swim(int deep){
        System.out.println("Dolphin is swimming deep inside ocean");
        return 8;
    }
    public void eat(){
        System.out.println("Dolphin is eating");
    }

}
