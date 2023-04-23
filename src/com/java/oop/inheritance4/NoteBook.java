package com.java.oop.inheritance4;

public class NoteBook extends Book{
    //constructor
    public NoteBook(){
        super(500,"Legends","History");
    }
//Static methods cannot be overridden
    public static void read(){
        System.out.println("NoteBook read");
    }


}
