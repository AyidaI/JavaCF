package com.java.oop.abstraction.abstraction1;

public class OnlineStudent extends Student{

    //constructor
    public OnlineStudent(String name, int id){
        super("Tim",1234);
    }
    public void study(){
        System.out.println("Studying in Online");
    }
    public int test1(){
        System.out.println("Online Student taking test");
        return 4;

    }
    public int watchViaZoom(){
        System.out.println("Attending via zoom");
        return 4;
    }
}
