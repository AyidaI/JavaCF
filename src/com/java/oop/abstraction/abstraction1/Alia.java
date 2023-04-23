package com.java.oop.abstraction.abstraction1;


//grandchild/ second level of child
public class Alia extends OnlineStudent{

    //constructor
    public Alia(String name, int id){

        super("OnlineName",1112);
    }

@Override
public void study(){
    System.out.println("Alia studies  Online");
}@Override
    public int test1(){
        return 4;
    }
    @Override
    public int watchViaZoom(){
        return 4;
    }
    @Override
    public void sleep(){
        System.out.println("Alia sleeps");

    }
}